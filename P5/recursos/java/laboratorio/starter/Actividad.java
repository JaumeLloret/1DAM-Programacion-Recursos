public final class Actividad {
    private final String codigo;
    private final String titulo;
    private final int horas;
    private final int dia;
    private Estado estado;

    public Actividad(String codigo, String titulo, int horas, int dia, Estado estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horas = horas;
        this.dia = dia;
        this.estado = estado;
    }

    public String codigo() { return codigo; }
    public String titulo() { return titulo; }
    public int horas() { return horas; }
    public int dia() { return dia; }
    public Estado estado() { return estado; }
    public boolean activa() { return estado == Estado.ACTIVA; }
    public boolean cancelada() { return estado == Estado.CANCELADA; }
    public void cambiarEstado(Estado nuevoEstado) { estado = nuevoEstado; }
}
