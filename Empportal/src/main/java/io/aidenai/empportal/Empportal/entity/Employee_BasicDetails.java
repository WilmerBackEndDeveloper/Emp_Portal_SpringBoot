package io.aidenai.empportal.Empportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee_BasicDetails {
    @Id
    int empid;

    String empname;

    String email;

    int phone;
}
