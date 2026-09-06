public class DemoCapacidades {
    interface Activable {
        String activar();
    }

    interface Describible {
        String descripcion();
    }

    static final class Panel implements Activable, Describible {
        @Override
        public String activar() {
            return "panel-activo";
        }

        @Override
        public String descripcion() {
            return "panel-informativo";
        }
    }

    static final class Alarma implements Activable {
        @Override
        public String activar() {
            return "alarma-activa";
        }
    }

    static String iniciar(Activable dispositivo) {
        return dispositivo.activar();
    }

    public static void main(String[] args) {
        Panel panel = new Panel();
        System.out.println(iniciar(panel));
        System.out.println(iniciar(new Alarma()));
        System.out.println(panel.descripcion());
    }
}
