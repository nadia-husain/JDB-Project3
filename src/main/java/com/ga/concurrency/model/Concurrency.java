package com.ga.concurrency.model;

import com.ga.concurrency.enums.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Concurrency {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;
    private Role role;
    private double projectCompletion;

}
