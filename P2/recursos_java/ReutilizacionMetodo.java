import java.util.Locale;

public class ReutilizacionMetodo {
    public static String normalizarEtiqueta(String texto) {
        return texto.strip().toUpperCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        String estudiante = normalizarEtiqueta("  Ana Pérez ");
        String actividad = normalizarEtiqueta(" métodos en Java  ");

        System.out.println(estudiante);
        System.out.println(actividad);
    }
}
