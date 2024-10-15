package uz.br29.apphibernate.migration;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.exception.FlywayValidateException;

public class FlywayMigration {
    public static void migrate() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/db_test_hibernate", "postgres", "siroj1294")
                .load();
        try {
            flyway.migrate();
            System.out.println("Migration completed successfully.");
        } catch (FlywayValidateException e) {
            System.err.println("Migration validation failed: " + e.getMessage());
            System.out.println("Running repair to update schema history...");
            flyway.repair();
            System.out.println("Repair completed. Please check your migrations.");
        } catch (Exception e) {
            System.err.println("Migration failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}