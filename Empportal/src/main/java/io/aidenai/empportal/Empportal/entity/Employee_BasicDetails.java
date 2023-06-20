package io.aidenai.empportal.Empportal.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee_BasicDetails {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Sequence auto generation for employee ID

    int empid;

    String empname;

    String email;

    String Gender;
    long phone;
}
