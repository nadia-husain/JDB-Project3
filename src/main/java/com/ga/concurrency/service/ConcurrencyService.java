package com.ga.concurrency.service;

import com.ga.concurrency.enums.Role;
import com.ga.concurrency.model.Employee;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConcurrencyService {

    public List<Employee> readEmployeesFromCSV(String filePath) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double salary = Double.parseDouble(parts[2]);
                LocalDate joiningDate = LocalDate.parse(parts[3]);
                Role role = Role.valueOf(parts[4]);
                double projectCompletion = Double.parseDouble(parts[5]);

                employees.add(new Employee(id, name, salary, joiningDate, role, projectCompletion));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return employees;
    }

    private void incrementSalary(Employee emp) {
        double bonus = 0;

        if (emp.getProjectCompletion() > 0.6) {
            if (emp.getRole() == Role.Manager) {
                bonus = emp.getSalary() * 0.20;
            } else if (emp.getRole() == Role.Director) {
                bonus = emp.getSalary() * 0.5;
            } else {
                bonus = emp.getSalary() * 0.10;
            }
        }

        double finalSalary = emp.getSalary() + bonus;

        emp.setUpdatedSalary(finalSalary);

        System.out.println(Thread.currentThread().getName()
                + " processed " + emp.getName()
                + " final salary = " + finalSalary);
    }

}
