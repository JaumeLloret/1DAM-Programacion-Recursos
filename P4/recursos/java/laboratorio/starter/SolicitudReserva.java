public final class SolicitudReserva {
    private final RecursoReservable recurso;
    private final PoliticaPrioridad politica;

    public SolicitudReserva(RecursoReservable recurso, PoliticaPrioridad politica) {
        this.recurso = recurso;
        this.politica = politica;
    }

    public String resumen(int prioridadBase) {
        return recurso.codigo() + " | prioridad=" + politica.calcular(prioridadBase);
    }
}
