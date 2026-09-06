# Starter OODB Rutas P7

Compila como modelo Java inicial, pero no persiste: faltan las anotaciones/estructuras OODB y `CatalogoRutasOodb` contiene TODO. Debes crear esa evidencia; el starter no acredita CE.

`guardarDosAtomico(...)` está declarado como andamiaje para que dos rutas que comparten un mismo refugio puedan persistirse dentro de **una única transacción** y para ensayar rollback. No lo sustituyas por dos llamadas independientes que abran contextos distintos si pretendes conservar el mismo objeto relacionado.

## Licencia y versión

Maven resuelve `com.objectdb:objectdb-jk:2.9.5` desde `https://m2.objectdb.com`. Se fija la **release estable 2.9.5**, suficiente para Jakarta Persistence 3.2 y más reproducible para el curso que la snapshot temporal `2.9.5_02`. ObjectDB es propietario; no copies su JAR ni una clave al repositorio/AULES. El laboratorio usa dos entidades, bajo el límite gratuito documentado.

## Limpieza segura

Usa una `.odb` dentro de `target/` o una carpeta temporal. No versiones bases. Ejecuta `mvn test` con JDK 26 después de implementar CRUD y pruebas de reapertura.
