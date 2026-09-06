package es.ies.p4.starter;

public class Main {
    public static void main(String[] args) {
        RecursoReservable sala = new Sala("S-1", "Sala Norte", 24);
        RecursoReservable equipo = new Equipo("E-1", "Portatil", "movil");
        SolicitudReserva solicitud = new SolicitudReserva(sala, new PrioridadAccesible());

        System.out.println(sala.descripcion() + " | max=" + sala.duracionMaximaMinutos());
        System.out.println(equipo.descripcion() + " | max=" + equipo.duracionMaximaMinutos());
        System.out.println(solicitud.resumen(4));
    }
}
