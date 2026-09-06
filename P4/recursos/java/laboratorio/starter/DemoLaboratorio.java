public class DemoLaboratorio {
    private static String veredicto(boolean condicion) {
        return condicion ? "OK" : "FALLO";
    }

    public static void main(String[] args) {
        RecursoReservable sala = new Sala("S-1", "Sala Norte", 24);
        RecursoReservable equipo = new Equipo("E-1", "Portatil", "movil");

        System.out.println("ESC-01 | " + sala.descripcion()
                + " | max=" + sala.duracionMaximaMinutos()
                + " | " + veredicto(sala.duracionMaximaMinutos() >= 15));

        boolean descripcionEquipoCorrecta = equipo.descripcion()
                .equals("E-1 | Portatil | categoria=movil");
        System.out.println("ESC-02 | " + equipo.descripcion()
                + " | " + veredicto(descripcionEquipoCorrecta));

        SolicitudReserva normal = new SolicitudReserva(sala, new PrioridadNormal());
        SolicitudReserva accesible = new SolicitudReserva(sala, new PrioridadAccesible());
        boolean prioridadesValidas = normal.resumen(4).endsWith("4")
                && accesible.resumen(4).endsWith("6");
        System.out.println("ESC-03 | normal=4 | accesible=6 | "
                + veredicto(prioridadesValidas));

        int duracionEquipo = equipo.duracionMaximaMinutos();
        System.out.println("ESC-04 | max=" + duracionEquipo
                + " | contrato=" + (duracionEquipo >= 15)
                + " | " + veredicto(duracionEquipo >= 15));
        System.out.println("ESC-05 | " + equipo.centro() + " | OK");
        System.out.println("ESC-06 | pendiente de nueva politica");
    }
}
