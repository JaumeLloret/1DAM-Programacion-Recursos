import java.util.List;

public class DemoGenericos {
    private static <T> T primero(List<T> datos) {
        return datos.get(0);
    }

    public static void main(String[] args) {
        Resultado<String> texto = Resultado.encontrado("AulaFlow");
        Resultado<Integer> numero = Resultado.encontrado(26);
        System.out.println("texto=" + texto.valor() + " | numero=" + numero.valor());
        System.out.println("primero=" + primero(List.of("uno", "dos")));
    }
}
