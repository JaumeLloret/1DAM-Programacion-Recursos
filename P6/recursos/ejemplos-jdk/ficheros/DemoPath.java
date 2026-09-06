import java.nio.file.Path;

public class DemoPath {
    public static void main(String[] args) {
        Path base = Path.of("datos", "entrada");
        Path archivo = base.resolve("..").resolve("actividades.csv").normalize();
        System.out.printf("relativa=%s|nombre=%s|absoluta=%s%n",
                archivo, archivo.getFileName(), archivo.toAbsolutePath().isAbsolute());
    }
}
