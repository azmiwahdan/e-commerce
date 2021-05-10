package com.example.demo.edu.birzeit.ecommerce.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@EqualsAndHashCode
@Entity
@ToString

public class Product {

    @Id
    @GeneratedValue
    private int product_id;
    private String name;
    private double price;

}
