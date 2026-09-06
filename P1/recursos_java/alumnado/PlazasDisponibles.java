public class PlazasDisponibles {
    public static void main(String[] args) {
        final int CAPACIDAD_MAXIMA = 30;
        int plazasOcupadas = 27;
        int plazasLibres = CAPACIDAD_MAXIMA - plazasOcupadas;

        System.out.println("Capacidad: " + CAPACIDAD_MAXIMA);
        System.out.println("Ocupadas: " + plazasOcupadas);
        System.out.println("Libres: " + plazasLibres);
    }
}
