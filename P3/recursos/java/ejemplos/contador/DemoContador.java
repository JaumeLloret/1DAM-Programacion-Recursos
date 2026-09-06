package es.ies.p3.ejemplos.contador;

public class DemoContador {
    public static void main(String[] args) {
        Contador a = new Contador("A");
        Contador b = new Contador("B");
        a.incrementar();
        a.incrementar();
        b.incrementar();
        System.out.println(a.resumen());
        System.out.println(b.resumen());

        Contador alias = a;
        alias.incrementar();
        System.out.println("alias=" + a.resumen());
        System.out.println("misma referencia=" + (a == alias));
        System.out.println("objetos distintos=" + (a == b));
    }
}

