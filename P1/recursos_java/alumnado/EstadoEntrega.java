public class EstadoEntrega {
    public static void main(String[] args) {
        int estado = 2;

        switch (estado) {
            case 0 -> System.out.println("Sin iniciar");
            case 1 -> System.out.println("En preparación");
            case 2 -> System.out.println("Entregada");
            case 3 -> System.out.println("Revisada");
            default -> System.out.println("Código desconocido");
        }
    }
}
