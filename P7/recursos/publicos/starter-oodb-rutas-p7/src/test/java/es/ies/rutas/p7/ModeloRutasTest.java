package es.ies.rutas.p7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ModeloRutasTest {
    @Test void construyeElPojoInicial() {
        var ruta = new Ruta("Circular", 2, new Coordenada(39.5, -0.4), new Refugio("Norte", 20));
        assertAll(() -> assertEquals("Circular", ruta.getNombre()), () -> assertEquals("Norte", ruta.getDestino().getNombre()));
    }
}
