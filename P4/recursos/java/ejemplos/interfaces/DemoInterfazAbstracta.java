public class DemoInterfazAbstracta {
    abstract static class ElementoConIdentidad {
        private final String codigo;

        ElementoConIdentidad(String codigo) {
            this.codigo = codigo;
        }

        public final String codigo() {
            return codigo;
        }
    }

    interface Activable {
        String activar();
    }

    static final class Panel extends ElementoConIdentidad implements Activable {
        Panel(String codigo) {
            super(codigo);
        }

        @Override
        public String activar() {
            return codigo() + ":activo";
        }
    }

    public static void main(String[] args) {
        Activable capacidad = new Panel("P-1");
        System.out.println(capacidad.activar());
    }
}
