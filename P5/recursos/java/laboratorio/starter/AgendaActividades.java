import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class AgendaActividades {
    private static final Pattern CODIGO = Pattern.compile("AF-.*");
    private final List<Actividad> actividades = new ArrayList<>();
    private final int[] cargaSemanal = new int[5];

    public void registrar(Actividad actividad)
            throws CodigoActividadInvalidoException, ActividadDuplicadaException {
        if (!CODIGO.matcher(actividad.codigo()).matches()) {
            throw new CodigoActividadInvalidoException(actividad.codigo());
        }
        if (actividad.horas() < 0 || actividad.dia() < 0 || actividad.dia() >= cargaSemanal.length) {
            throw new IllegalArgumentException("Horas o día fuera de contrato");
        }
        if (buscar(actividad.codigo()).estaEncontrado()) {
            throw new ActividadDuplicadaException(actividad.codigo());
        }
        actividades.add(actividad);
        cargaSemanal[actividad.dia()] += actividad.horas();
        verificarInvariante();
    }

    public Resultado<Actividad> buscar(String codigo) {
        for (Actividad actividad : actividades) {
            if (actividad.codigo().equals(codigo)) {
                return Resultado.encontrado(actividad);
            }
        }
        return Resultado.ausente();
    }

    public int eliminarCanceladas() {
        int eliminadas = 0;
        for (Actividad actividad : actividades) {
            if (actividad.cancelada()) {
                actividades.remove(actividad);
                cargaSemanal[actividad.dia()] -= actividad.horas();
                eliminadas++;
            }
        }
        verificarInvariante();
        return eliminadas;
    }

    public int size() { return actividades.size(); }

    public int cargaTotal() {
        int total = 0;
        for (int carga : cargaSemanal) total += carga;
        return total;
    }

    public long contarActivas() {
        return actividades.stream().filter(Actividad::activa).count();
    }

    public int horasActivasAgregado() {
        return actividades.stream().filter(Actividad::activa).mapToInt(Actividad::horas).sum();
    }

    public int horasActivasImperativo() {
        int total = 0;
        for (Actividad actividad : actividades) {
            if (actividad.activa()) total += actividad.horas();
        }
        return total;
    }

    public void forzarCargaParaDiagnostico(int dia, int valor) {
        cargaSemanal[dia] = valor;
    }

    public void verificarInvariante() {
        assert cargaTotal() >= 0 : "carga interna negativa";
    }
}
