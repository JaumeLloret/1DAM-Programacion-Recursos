import java.util.Locale;

public class DemoFormato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        String fila = "%-18s | %02d h | %7.2f %%".formatted("Diseño y revisión", 4, 62.5);
        System.out.println(fila);
    }
}
