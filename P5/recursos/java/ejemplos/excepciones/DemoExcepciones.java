import java.util.HashSet;
import java.util.Set;

public class DemoExcepciones {
    private static final Set<String> CODIGOS = new HashSet<>();

    private static void registrar(String codigo) throws ActividadDuplicadaException {
        if (!CODIGOS.add(codigo)) {
            throw new ActividadDuplicadaException(codigo);
        }
    }

    public static void main(String[] args) {
        try {
            registrar("AF-DEV-101");
            registrar("AF-DEV-101");
            System.out.println("No debería alcanzarse");
        } catch (ActividadDuplicadaException e) {
            System.out.println("capturada=" + e.getMessage());
        } finally {
            System.out.println("intento-finalizado");
        }
    }
}
