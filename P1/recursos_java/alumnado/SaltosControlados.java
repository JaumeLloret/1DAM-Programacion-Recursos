public class SaltosControlados {
    public static void main(String[] args) {
        for (int entrega = 1; entrega <= 6; entrega++) {
            if (entrega == 2) {
                System.out.println("Entrega 2 omitida");
                continue;
            }

            if (entrega == 5) {
                System.out.println("Proceso detenido en entrega 5");
                break;
            }

            System.out.println("Entrega revisada: " + entrega);
        }
    }
}
