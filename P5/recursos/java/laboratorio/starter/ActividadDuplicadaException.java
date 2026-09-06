public final class ActividadDuplicadaException extends Exception {
    private final String codigo;

    public ActividadDuplicadaException(String codigo) {
        super("Actividad duplicada: " + codigo);
        this.codigo = codigo;
    }

    public String codigo() {
        return codigo;
    }
}
