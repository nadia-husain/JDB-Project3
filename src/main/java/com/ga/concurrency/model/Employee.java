package com.ga.concurrency.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ga.concurrency.enums.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@JsonPropertyOrder({
        "id",
        "name",
        "role",
        "joiningDate",
        "projectCompletion",
        "salary",
        "roleBonus",
        "yearBonus",
        "updatedSalary"
})
public class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;
    private Role role;
    private double projectCompletion;
    private double roleBonus;
    private double yearBonus;
    private double updatedSalary;

    public Employee(int id, String name, double salary, LocalDate joiningDate, Role role, double projectCompletion, double roleBonus, double yearBonus, double updatedSalary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.role = role;
        this.projectCompletion = projectCompletion;
        this.roleBonus = roleBonus;
        this.yearBonus = yearBonus;
        this.updatedSalary = updatedSalary;
    }

    public Employee(int id, String name, double salary, LocalDate joiningDate, Role role, double projectCompletion) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.role = role;
        this.projectCompletion = projectCompletion;
    }
}
