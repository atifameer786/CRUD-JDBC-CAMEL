package com.apachecamel.SpringBootWithCamelJDBC.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String empId;
    private String empName;
    private String empMob;
    private String empEmailId;
    private String empJobPos;

}
