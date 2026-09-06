import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIteradorSeguro {
    public static void main(String[] args) {
        List<String> estados = new ArrayList<>(List.of("CANCELADA", "CANCELADA", "ACTIVA"));
        Iterator<String> iterator = estados.iterator();
        int eliminadas = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals("CANCELADA")) {
                iterator.remove();
                eliminadas++;
            }
        }
        System.out.println("eliminadas=" + eliminadas + " | restantes=" + estados);
    }
}
