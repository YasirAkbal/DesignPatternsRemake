/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Factory;

/**
 *
 * @author yasir
 */
public class PayrollOffice {
    public void paySalary(Employee employee) {
        String name = employee.getName();
        String department = employee.getDepartment();
        double salary = employee.calculateSalary();

        System.out.println("Paying " + salary + " to " + name + " in " + department);
    }
}
