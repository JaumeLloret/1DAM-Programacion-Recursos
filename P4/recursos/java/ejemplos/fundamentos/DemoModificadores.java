public class DemoModificadores {
    abstract static class Recurso {
        private final String codigo;

        Recurso(String codigo) {
            this.codigo = codigo;
        }

        public final String codigo() {
            return codigo;
        }

        public abstract int duracion();
    }

    static final class Equipo extends Recurso {
        Equipo(String codigo) {
            super(codigo);
        }

        @Override
        public int duracion() {
            return 90;
        }
    }

    public static void main(String[] args) {
        Recurso recurso = new Equipo("E-2");
        System.out.println(recurso.codigo() + " | " + recurso.duracion());

        // Experimentos: no publicar descomentados.
        // Recurso incompleto = new Recurso("R-0");
        // class EquipoEspecial extends Equipo { }
        // class RecursoMutable extends Recurso {
        //     RecursoMutable() { super("R-1"); }
        //     public String codigo() { return "otro"; }
        //     public int duracion() { return 15; }
        // }
    }
}
