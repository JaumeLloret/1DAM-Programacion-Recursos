package es.ies.rutas.p7;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public final class CatalogoRutasOodb implements AutoCloseable {
    public CatalogoRutasOodb(Path archivo) { throw pendiente("abrir/crear base"); }
    public long guardar(Ruta ruta) { throw pendiente("guardar"); }
    /** Guarda dos rutas dentro de una única transacción. Úsalo para practicar grafo compartido y rollback. */
    public void guardarDosAtomico(Ruta primera, Ruta segunda, boolean simularFallo) { throw pendiente("guardar dos de forma atómica"); }
    public Optional<Ruta> buscar(long id) { throw pendiente("buscar"); }
    public List<Ruta> listarPorDificultadMaxima(int maxima) { throw pendiente("consultar"); }
    public boolean actualizarDificultad(long id, int nueva) { throw pendiente("actualizar"); }
    public boolean borrar(long id) { throw pendiente("borrar"); }
    @Override public void close() { }
    private static UnsupportedOperationException pendiente(String tarea) { return new UnsupportedOperationException("TODO P7: " + tarea); }
}
