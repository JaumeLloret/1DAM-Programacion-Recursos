import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoFamilias {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("A", "A", "B"));
        Set<String> conjunto = new HashSet<>(lista);
        Map<String, Integer> porCodigo = new HashMap<>();
        porCodigo.put("AF-A", 2);
        porCodigo.put("AF-A", 3);
        Deque<String> cola = new ArrayDeque<>();
        cola.addLast("normal");
        cola.addFirst("urgente");

        System.out.println("list=" + lista.size() + " | set=" + conjunto.size());
        System.out.println("map=" + porCodigo.size() + " | valor=" + porCodigo.get("AF-A"));
        System.out.println("primero-cola=" + cola.removeFirst());
    }
}
