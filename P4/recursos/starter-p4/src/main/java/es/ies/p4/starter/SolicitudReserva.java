package es.ies.p4.starter;

public final class SolicitudReserva {
    private final RecursoReservable recurso;
    private final PoliticaPrioridad politica;

    public SolicitudReserva(RecursoReservable recurso, PoliticaPrioridad politica) {
        this.recurso = recurso;
        this.politica = politica;
    }

    public String resumen(int base) {
        return recurso.codigo() + " | prioridad=" + politica.calcular(base);
    }
}
