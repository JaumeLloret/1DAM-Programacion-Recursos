import java.util.List;

public class DemoAgregadas {
    record Actividad(String titulo, int horas, boolean activa) { }

    public static void main(String[] args) {
        List<Actividad> datos = List.of(
                new Actividad("Diseñar", 3, true),
                new Actividad("Revisar", 2, false),
                new Actividad("Probar", 4, true));

        int imperativo = 0;
        for (Actividad actividad : datos) {
            if (actividad.activa()) {
                imperativo += actividad.horas();
            }
        }

        long activas = datos.stream().filter(Actividad::activa).count();
        int agregado = datos.stream()
                .filter(Actividad::activa)
                .mapToInt(Actividad::horas)
                .sum();
        List<String> titulos = datos.stream().map(Actividad::titulo).toList();

        System.out.println("activas=" + activas + " | horas=" + agregado);
        System.out.println("equivalentes=" + (imperativo == agregado));
        System.out.println("titulos=" + titulos);
    }
}
