package es.ies.rutas.p7;

public class Ruta {
    private Long id;
    private String nombre;
    private int dificultad;
    private Coordenada inicio;
    private Refugio destino;
    protected Ruta() { }
    public Ruta(String nombre, int dificultad, Coordenada inicio, Refugio destino) {
        this.nombre = nombre; this.dificultad = dificultad; this.inicio = inicio; this.destino = destino;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public int getDificultad() { return dificultad; }
    public Coordenada getInicio() { return inicio; }
    public Refugio getDestino() { return destino; }
    public void cambiarDificultad(int dificultad) { this.dificultad = dificultad; }
    // TODO P7: entidad, identidad, compuesto, relación y validación.
}
