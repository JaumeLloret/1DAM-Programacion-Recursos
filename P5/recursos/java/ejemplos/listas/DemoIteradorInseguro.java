import java.util.ArrayList;
import java.util.List;

public class DemoIteradorInseguro {
    public static void main(String[] args) {
        List<String> estados = new ArrayList<>(List.of("CANCELADA", "CANCELADA", "ACTIVA"));
        for (String estado : estados) {
            if (estado.equals("CANCELADA")) {
                estados.remove(estado);
            }
        }
        System.out.println("No debería alcanzarse: " + estados);
    }
}
