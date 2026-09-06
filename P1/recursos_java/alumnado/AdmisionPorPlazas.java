public class AdmisionPorPlazas {
    public static void main(String[] args) {
        final int CAPACIDAD_MAXIMA = 30;
        int plazasOcupadas = 29;

        if (plazasOcupadas < CAPACIDAD_MAXIMA) {
            System.out.println("Solicitud admitida");
        } else {
            System.out.println("Lista de espera");
        }
    }
}
