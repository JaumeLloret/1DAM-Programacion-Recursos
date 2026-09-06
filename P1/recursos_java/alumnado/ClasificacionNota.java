public class ClasificacionNota {
    public static void main(String[] args) {
        int nota = 9;

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota < 5) {
            System.out.println("Pendiente");
        } else if (nota < 9) {
            System.out.println("Superada");
        } else {
            System.out.println("Excelente");
        }
    }
}
