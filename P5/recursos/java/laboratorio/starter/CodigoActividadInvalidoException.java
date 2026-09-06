public final class CodigoActividadInvalidoException extends Exception {
    public CodigoActividadInvalidoException(String codigo) {
        super("Código de actividad inválido: " + codigo);
    }
}
