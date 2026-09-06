# Starter Maven P4

Proyecto mínimo alternativo para abrir el laboratorio en un IDE.

## Requisitos

- JDK 26 obligatorio.
- Maven 3.9 o compatible.

## Ejecución

```bash
mvn clean compile
java -cp target/classes es.ies.p4.starter.Main
```

La configuración `maven.compiler.release=26` debe mantenerse. El starter contiene deliberadamente el mismo defecto contractual del laboratorio; se corrige siguiendo el registro E3, no cambiando la versión de Java.
