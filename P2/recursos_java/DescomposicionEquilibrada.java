public class DescomposicionEquilibrada {
    public static boolean esPuntuacionValida(int puntuacion) {
        return puntuacion >= 0 && puntuacion <= 10;
    }

    public static String clasificar(int puntuacion) {
        if (puntuacion >= 9) {
            return "Excelente";
        }
        if (puntuacion >= 5) {
            return "Superada";
        }
        return "Pendiente";
    }

    public static void mostrarResultado(int puntuacion) {
        if (esPuntuacionValida(puntuacion)) {
            System.out.println("Resultado: " + clasificar(puntuacion));
        } else {
            System.out.println("Puntuación no válida");
        }
    }

    public static void main(String[] args) {
        mostrarResultado(8);
        mostrarResultado(12);
    }
}
