package uz.br29.migration;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    public static void migrate() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/db_test_hibernate2", "postgres", "siroj1294")
                .load();
        flyway.migrate();
    }
}