package uz.br29.apphibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppHibernateApplication.class, args);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        // Run Flyway migrations
//        FlywayMigration.migrate();
//
//        System.out.println("-------------------------------------------------------------------------- Hello world! --------------------------------------------------------------------------");
//
//        // Create a category
//        Category category = new Category();
//        category.setCategoryName("Fruits");
//        category.setDescription("Apple, Orange, Grape ...");
//
//        // Create a product
//        Product product = new Product();
//        product.setDescription("");
//        product.setProductName("Apple");
//        product.setPrice(3.00);
//
//        SessionFactory factory = HibernateUtils.getSessionFactory();
//
//        // Use a single session for both operations
//        try (Session session = factory.openSession()) {
//            Transaction transaction = session.beginTransaction();
//
//            try {
//                // Save the category
//                session.save(category);
//                System.out.println("Category is saved with id " + category.getId());
//
//                // Set category ID for the product
//                product.setCategoryId(category.getId());
//
//                // Save the product
//                session.save(product);
//                transaction.commit();
//                System.out.println("Product is saved with id " + product.getId());
//            } catch (HibernateException exception) {
//                if (transaction != null) {
//                    transaction.rollback();
//                }
//                System.err.println("There is an error while saving: " + exception.getMessage());
//                exception.printStackTrace();
//            }
//        } catch (Exception exception) {
//            System.err.println("An error occurred: " + exception.getMessage());
//            exception.printStackTrace();
//        }
//
//        System.out.println("**********************************************************************************************************************************************************************");
//    }
//}
