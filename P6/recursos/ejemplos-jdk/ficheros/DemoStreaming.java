import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class DemoStreaming {
    public static void main(String[] args) throws Exception {
        Path archivo = Files.createTempFile("p6-stream-", ".txt");
        try {
            Files.write(archivo, IntStream.rangeClosed(1, 5_000)
                    .mapToObj(i -> "ACT-" + i).toList(), StandardCharsets.UTF_8);
            long lineas;
            try (var stream = Files.lines(archivo, StandardCharsets.UTF_8)) {
                lineas = stream.filter(linea -> linea.startsWith("ACT-")).count();
            }
            System.out.println("lineas=" + lineas + "|cerrado=true");
        } finally {
            Files.deleteIfExists(archivo);
        }
    }
}
