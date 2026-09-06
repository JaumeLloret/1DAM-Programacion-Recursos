import java.util.ArrayList;
import java.util.List;

public class DemoLista {
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>();
        tareas.add("Diseñar");
        tareas.add("Probar");
        tareas.add("Revisar");
        tareas.set(1, "Ejecutar casos");
        boolean contiene = tareas.contains("Revisar");
        String eliminada = tareas.remove(0);
        System.out.println("eliminada=" + eliminada);
        System.out.println("size=" + tareas.size() + " | contiene=" + contiene);
        System.out.println("primera=" + tareas.get(0));
    }
}
