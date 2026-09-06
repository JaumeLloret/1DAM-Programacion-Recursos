public class ObjetoStringBuilder {
    public static String crearResumen(String estudiante, int retraso) {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Estudiante: ").append(estudiante);
        resumen.append(System.lineSeparator());
        resumen.append("Retraso: ").append(retraso).append(" min");
        return resumen.toString();
    }

    public static void main(String[] args) {
        System.out.println(crearResumen("Nora", 8));
    }
}
