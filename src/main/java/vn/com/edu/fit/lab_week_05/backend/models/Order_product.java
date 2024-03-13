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

}
