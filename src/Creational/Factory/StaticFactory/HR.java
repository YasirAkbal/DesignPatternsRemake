/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.StaticFactory;

import Creational.Factory.Factory.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasir
 */
public class HR {
    private List<Employee> employees = new ArrayList<Employee>();

    public HR() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        System.out.println("All Employees");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
