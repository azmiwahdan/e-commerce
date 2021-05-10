package com.example.demo.edu.birzeit.ecommerce.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table


public class Delivery {

    @Id
    @GeneratedValue
    private int delivery_Id;

    private int customer_Id;
    private int employee_Id;
    private String location;
    private Date deliveryDate;


}
