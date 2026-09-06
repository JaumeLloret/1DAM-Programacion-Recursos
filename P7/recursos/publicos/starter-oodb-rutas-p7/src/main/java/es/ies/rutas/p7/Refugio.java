package es.ies.rutas.p7;

public class Refugio {
    private Long id;
    private String nombre;
    private int capacidad;
    protected Refugio() { }
    public Refugio(String nombre, int capacidad) { this.nombre = nombre; this.capacidad = capacidad; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCapacidad() { return capacidad; }
    // TODO P7: definir entidad e identidad persistente.
}
