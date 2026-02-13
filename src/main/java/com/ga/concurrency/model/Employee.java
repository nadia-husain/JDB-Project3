package com.ga.concurrency.model;

import com.ga.concurrency.enums.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;
    private Role role;
    private double projectCompletion;

    public Employee(int id, String name, double salary, LocalDate joiningDate, Role role, double projectCompletion) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.role = role;
        this.projectCompletion = projectCompletion;
    }
}
