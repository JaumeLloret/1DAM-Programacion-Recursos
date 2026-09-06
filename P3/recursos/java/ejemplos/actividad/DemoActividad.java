package es.ies.p3.ejemplos.actividad;

public class DemoActividad {
    public static void main(String[] args) {
        Actividad lectura = new Actividad("  Leer P3  ", 25);
        Actividad normalizada = new Actividad(" ", -4);
        System.out.println(lectura.resumen());
        System.out.println(normalizada.resumen());
        System.out.println("cambio pendiente=" + lectura.cambiarEstimacion(40));
        lectura.marcarComoCompletada();
        System.out.println("cambio completada=" + lectura.cambiarEstimacion(50));
        System.out.println(lectura.resumen());
    }
}

