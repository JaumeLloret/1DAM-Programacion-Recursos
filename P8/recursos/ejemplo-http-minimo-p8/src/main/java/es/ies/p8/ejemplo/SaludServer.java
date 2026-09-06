package es.ies.p8.ejemplo;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class SaludServer implements AutoCloseable {
    private final HttpServer server; private final ExecutorService executor;
    private SaludServer(HttpServer server, ExecutorService executor) { this.server = server; this.executor = executor; }
    public static SaludServer crear(int puerto) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), puerto), 0);
        ExecutorService executor = Executors.newSingleThreadExecutor(); server.setExecutor(executor);
        server.createContext("/salud", exchange -> {
            byte[] body = "{\"estado\":\"ok\"}".getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json; charset=utf-8");
            exchange.sendResponseHeaders(200, body.length);
            try (var output = exchange.getResponseBody()) { output.write(body); }
            finally { exchange.close(); }
        });
        return new SaludServer(server, executor);
    }
    public void arrancar() { server.start(); }
    public int puerto() { return server.getAddress().getPort(); }
    @Override public void close() { server.stop(0); executor.shutdownNow(); }
}
