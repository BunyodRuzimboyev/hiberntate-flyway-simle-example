package uz.br29.apphibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.br29.apphibernate.entity.Product;

@Service
public class ProductService {

    public ResponseEntity saveProduct(Product product) {
        Transaction transaction = null;
        try (Session session = uz.br29.apphibernate.utils.HibernateUtils.openSession()) {
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();

            return ResponseEntity.ok(product);

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println("Error saving product: " + e.getMessage());
            e.printStackTrace();
        }
        return ResponseEntity.status(409).body("Error ... !!!!");
    }
}