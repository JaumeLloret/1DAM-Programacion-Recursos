# Starter Maven P5

Proyecto mínimo para comprobar JDK 26, colecciones, regex, excepción propia, genericidad y un test ya adquirido en E4.

```text
mvn test
mvn -q exec:java -Dexec.mainClass=es.ies.p5.Main
```

El laboratorio completo está en `java/laboratorio/starter/`. Este proyecto no contiene su solución.

## Qué demuestra y qué no

Este mini-starter sirve para **leer, ejecutar y verificar el entorno Maven/JDK**. Incluye `Registro<T>` como ejemplo suministrado de genericidad para que el proyecto sea compilable desde el inicio, pero **no acredita por sí solo `RA6.f`**. Para ese CE debes crear una clase genérica y un método genérico propios en las actividades/laboratorio/estación indicados y poder defender sus tipos.
