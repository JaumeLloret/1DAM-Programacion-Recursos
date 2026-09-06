public final class ActividadDuplicadaException extends Exception {
    public ActividadDuplicadaException(String codigo) {
        super("Actividad duplicada: " + codigo);
    }
}
