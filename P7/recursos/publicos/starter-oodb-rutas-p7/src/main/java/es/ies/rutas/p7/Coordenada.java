package es.ies.rutas.p7;

public class Coordenada {
    private double latitud;
    private double longitud;
    protected Coordenada() { }
    public Coordenada(double latitud, double longitud) { this.latitud = latitud; this.longitud = longitud; }
    public double getLatitud() { return latitud; }
    public double getLongitud() { return longitud; }
    // TODO P7: convertir en tipo compuesto persistente.
}
