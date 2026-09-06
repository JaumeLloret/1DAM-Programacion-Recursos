# Ejemplo HTTP mínimo P8

Ejecuta `mvn verify`. El test arranca un `HttpServer` en puerto efímero, consulta `/salud` con `HttpClient` y lo detiene. No usa base de datos y **no acredita RA9.f/g**.
