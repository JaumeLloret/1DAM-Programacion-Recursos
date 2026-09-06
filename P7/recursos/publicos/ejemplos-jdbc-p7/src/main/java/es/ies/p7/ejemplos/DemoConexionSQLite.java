package es.ies.p7.ejemplos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.DriverManager;

public class DemoConexionSQLite {
    public static void main(String[] args) throws Exception {
        Path base = Path.of("target", "demo-conexion.db").toAbsolutePath();
        Files.createDirectories(base.getParent());
        String url = "jdbc:sqlite:" + base;

        try (var connection = DriverManager.getConnection(url);
             var statement = connection.createStatement();
             var result = statement.executeQuery("SELECT sqlite_version()")) {
            System.out.println("Base: " + base);
            System.out.println("SQLite: " + result.getString(1));
        }
    }
}
