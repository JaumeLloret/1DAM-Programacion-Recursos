package es.ies.p5;

public final class CodigoInvalidoException extends Exception {
    public CodigoInvalidoException(String codigo) {
        super("Código inválido: " + codigo);
    }
}
