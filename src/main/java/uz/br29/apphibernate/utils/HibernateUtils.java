package uz.br29.apphibernate.utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import uz.br29.apphibernate.entity.Category;
import uz.br29.apphibernate.entity.Product;

import java.util.Properties;

public class HibernateUtils {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            synchronized (HibernateUtils.class) { // Thread safety
                if (factory == null) { // Double-check locking
                    try {
                        Properties properties = new Properties();
                        properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
                        properties.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/db_test_hibernate");
                        properties.setProperty("hibernate.connection.username", "postgres");
                        properties.setProperty("hibernate.connection.password", "siroj1294");
                        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
                        properties.setProperty("hibernate.hbm2ddl.auto", "update");
                        properties.setProperty("hibernate.show_sql", "true");
                        properties.setProperty("hibernate.format_sql", "true");

                        Configuration configuration = new Configuration();
                        configuration.setProperties(properties);
                        configuration.addAnnotatedClass(Category.class);
                        configuration.addAnnotatedClass(Product.class);

                        factory = configuration.buildSessionFactory();
                    } catch (Exception e) {
                        System.err.println("Initial SessionFactory creation failed: " + e);
                        throw new ExceptionInInitializerError(e);
                    }
                }
            }
        }
        return factory;
    }

    public static Session openSession() {
        return getSessionFactory().openSession();
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
