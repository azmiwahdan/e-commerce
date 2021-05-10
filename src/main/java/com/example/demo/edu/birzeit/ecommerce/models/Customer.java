package com.example.demo.edu.birzeit.ecommerce.models;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue
    private int customer_Id;
    private String customer_Name;

    private int payment_account;




}
