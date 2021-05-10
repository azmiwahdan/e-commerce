package com.example.demo.edu.birzeit.ecommerce.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
@Entity
@Getter
@Setter

public class Employee {
    @Id
    @GeneratedValue
    private int employee_Id;

    private String employee_Name;
    private int salary;

}
