package com.iuh.productservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private int price;
    @OneToOne
    private User user;

    public Product(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
