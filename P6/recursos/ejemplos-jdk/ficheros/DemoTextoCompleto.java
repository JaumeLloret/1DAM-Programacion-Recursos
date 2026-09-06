import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class DemoTextoCompleto {
    public static void main(String[] args) throws Exception {
        Path archivo = Files.createTempFile("p6-texto-", ".txt");
        String original = "Programación · revisión ñ";
        try {
            Files.writeString(archivo, original, StandardCharsets.UTF_8);
            String recuperado = Files.readString(archivo, StandardCharsets.UTF_8);
            System.out.printf("igual=%s|caracteres=%d%n", original.equals(recuperado), recuperado.length());
        } finally {
            Files.deleteIfExists(archivo);
        }
    }
}
