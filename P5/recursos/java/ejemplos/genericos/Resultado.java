public final class Resultado<T> {
    private final T valor;
    private final boolean encontrado;

    private Resultado(T valor, boolean encontrado) {
        this.valor = valor;
        this.encontrado = encontrado;
    }

    public static <T> Resultado<T> encontrado(T valor) {
        return new Resultado<>(valor, true);
    }

    public static <T> Resultado<T> ausente() {
        return new Resultado<>(null, false);
    }

    public T valor() {
        return valor;
    }

    public boolean estaEncontrado() {
        return encontrado;
    }
}
