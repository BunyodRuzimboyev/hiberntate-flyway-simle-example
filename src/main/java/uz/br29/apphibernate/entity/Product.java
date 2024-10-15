package uz.br29.apphibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product", schema = "public")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "price")
    private Double price;

    public Product(){

    }

    public Product(Long productId, String productName, String description, Long categoryId, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.categoryId = categoryId;
        this.price = price;
    }

    public Product(String productName, String description, Long categoryId, Double price) {
        this.productName = productName;
        this.description = description;
        this.categoryId = categoryId;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
