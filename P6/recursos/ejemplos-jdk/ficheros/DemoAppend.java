import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class DemoAppend {
    public static void main(String[] args) throws Exception {
        Path archivo = Files.createTempFile("p6-append-", ".log");
        try {
            Files.writeString(archivo, "inicio\n", StandardCharsets.UTF_8,
                    StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(archivo, "cambio\n", StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
            var lineas = Files.readAllLines(archivo, StandardCharsets.UTF_8);
            System.out.printf("lineas=%d|final=%s%n",
                    lineas.size(), lineas.get(lineas.size() - 1));
        } finally {
            Files.deleteIfExists(archivo);
        }
    }
}
