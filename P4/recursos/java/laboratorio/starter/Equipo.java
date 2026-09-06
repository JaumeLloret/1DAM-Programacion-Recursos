public final class Equipo extends RecursoReservable {
    private final String categoria;

    public Equipo(String codigo, String nombre, String categoria) {
        super(codigo, nombre);
        this.categoria = categoria;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | categoria=" + categoria;
    }

    @Override
    public int duracionMaximaMinutos() {
        return 0;
    }
}
