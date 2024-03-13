package vn.com.edu.fit.lab_week_05.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_product")
public class Order_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private String id;
    private String cus_id;
    @Column(name = "quantity", nullable = false)
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order_product() {
    }

    public Order_product(String id, String cus_id, String quantity, Product product) {
        this.id = id;
        this.cus_id = cus_id;
        this.quantity = quantity;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order_product{" +
                "id='" + id + '\'' +
                ", cus_id='" + cus_id + '\'' +
                ", quantity='" + quantity + '\'' +
                ", product=" + product +
                '}';
    }
}
