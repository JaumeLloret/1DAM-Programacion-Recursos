import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class DemoBytes {
    public static void main(String[] args) throws Exception {
        Path origen = Files.createTempFile("p6-bytes-o-", ".bin");
        Path destino = Files.createTempFile("p6-bytes-d-", ".bin");
        try {
            byte[] datos = {(byte) 0x89, 0x50, 0x4E, 0x47};
            Files.write(origen, datos);
            Files.copy(origen, destino, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            System.out.printf("bytes=%d|iguales=%s%n", datos.length,
                    Arrays.equals(Files.readAllBytes(origen), Files.readAllBytes(destino)));
        } finally {
            Files.deleteIfExists(origen);
            Files.deleteIfExists(destino);
        }
    }
}
