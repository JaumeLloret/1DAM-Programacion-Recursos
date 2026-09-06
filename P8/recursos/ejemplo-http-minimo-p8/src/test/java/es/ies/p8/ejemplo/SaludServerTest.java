package es.ies.p8.ejemplo;
import org.junit.jupiter.api.Test;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
class SaludServerTest {
    @Test void respondeEnPuertoEfimero() throws Exception {
        try (var server = SaludServer.crear(0)) {
            server.arrancar();
            var request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:" + server.puerto() + "/salud")).GET().build();
            var response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            assertEquals(200, response.statusCode()); assertEquals("{\"estado\":\"ok\"}", response.body());
        }
    }
}
