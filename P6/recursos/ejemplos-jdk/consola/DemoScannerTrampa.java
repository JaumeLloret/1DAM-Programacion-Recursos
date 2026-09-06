import java.util.Scanner;

public class DemoScannerTrampa {
    public static void main(String[] args) {
        String entrada = "4\nDiseño y revisión\n";
        try (Scanner scanner = new Scanner(entrada)) {
            int horas = scanner.nextInt();
            String vacio = scanner.nextLine();
            String titulo = scanner.nextLine();
            System.out.printf("horas=%d|vacio=%s|titulo=%s%n", horas, vacio.isEmpty(), titulo);
        }
    }
}
