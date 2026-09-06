public final class Sala extends RecursoReservable {
    private final int puestos;

    public Sala(String codigo, String nombre, int puestos) {
        super(codigo, nombre);
        this.puestos = puestos;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | puestos=" + puestos;
    }

    @Override
    public int duracionMaximaMinutos() {
        return 180;
    }
}
