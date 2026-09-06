public class DemoSuperMetodo {
    static class Recurso {
        private final String codigo;
        private final String nombre;

        Recurso(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

        public String descripcion() {
            return codigo + " | " + nombre;
        }
    }

    static final class Sala extends Recurso {
        private final int puestos;

        Sala(String codigo, String nombre, int puestos) {
            super(codigo, nombre);
            this.puestos = puestos;
        }

        @Override
        public String descripcion() {
            return super.descripcion() + " | puestos=" + puestos;
        }
    }

    public static void main(String[] args) {
        Recurso recurso = new Sala("S-3", "Aula taller", 20);
        System.out.println(recurso.descripcion());
    }
}
