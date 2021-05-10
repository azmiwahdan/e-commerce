package com.example.demo.edu.birzeit.ecommerce.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Orders {

    @Id
    @GeneratedValue
    private int order_Id;

    private int customer_Id;
    private int employee_Id;
    private int product_Id;
    private Date order_Date;

}
