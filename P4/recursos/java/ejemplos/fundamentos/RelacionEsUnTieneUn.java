public class RelacionEsUnTieneUn {
    abstract static class Recurso {
        private final String codigo;

        Recurso(String codigo) {
            this.codigo = codigo;
        }

        public final String codigo() {
            return codigo;
        }
    }

    static final class Sala extends Recurso {
        Sala(String codigo) {
            super(codigo);
        }
    }

    static final class Solicitud {
        private final Recurso recurso;

        Solicitud(Recurso recurso) {
            this.recurso = recurso;
        }

        String resumen() {
            return "Solicitud para " + recurso.codigo();
        }
    }

    public static void main(String[] args) {
        Recurso recurso = new Sala("S-1");
        Solicitud solicitud = new Solicitud(recurso);
        System.out.println("Sala es-un Recurso: " + recurso.codigo());
        System.out.println("Solicitud tiene-un Recurso: " + solicitud.resumen());
    }
}
