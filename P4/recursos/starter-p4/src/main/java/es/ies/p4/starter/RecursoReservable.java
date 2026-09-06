package es.ies.p4.starter;

public abstract class RecursoReservable {
    private final String codigo;
    private final String nombre;

    protected RecursoReservable(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public final String codigo() {
        return codigo;
    }

    public String descripcion() {
        return codigo + " | " + nombre;
    }

    /** @return minutos; postcondición: resultado mayor o igual que 15 */
    public abstract int duracionMaximaMinutos();
}
