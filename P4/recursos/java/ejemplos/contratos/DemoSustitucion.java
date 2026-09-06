public class DemoSustitucion {
    abstract static class Recurso {
        /**
         * Devuelve la duración máxima admitida.
         *
         * @return minutos, siempre un valor mayor o igual que 15
         */
        public abstract int duracionMaximaMinutos();
    }

    static final class Sala extends Recurso {
        @Override
        public int duracionMaximaMinutos() {
            return 180;
        }
    }

    static final class Equipo extends Recurso {
        @Override
        public int duracionMaximaMinutos() {
            return 90;
        }
    }

    static boolean cumple(Recurso recurso) {
        return recurso.duracionMaximaMinutos() >= 15;
    }

    public static void main(String[] args) {
        Recurso sala = new Sala();
        Recurso equipo = new Equipo();
        System.out.println("sala=" + cumple(sala));
        System.out.println("equipo=" + cumple(equipo));
    }
}
