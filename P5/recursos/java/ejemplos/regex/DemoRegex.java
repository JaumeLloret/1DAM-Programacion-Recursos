import java.util.regex.Pattern;

public class DemoRegex {
    private static final Pattern CODIGO = Pattern.compile("AF-[A-Z]{3}-\\d{3}");

    private static void mostrar(String texto) {
        boolean completo = CODIGO.matcher(texto).matches();
        boolean fragmento = CODIGO.matcher(texto).find();
        System.out.println(texto + " | matches=" + completo + " | find=" + fragmento);
    }

    public static void main(String[] args) {
        mostrar("AF-DEV-123");
        mostrar("XAF-DEV-123Y");
        mostrar("AF-dev-123");
        mostrar("AF-DEV-1234");
    }
}
