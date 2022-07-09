/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creational.Factory.StaticFactory;

import Creational.Factory.Factory.Employee;
import Creational.Factory.Factory.PayrollOffice;
import java.util.List;

/**
 *
 * @author yasir
 */
public class StaticFactoryTest {

    public static void main(String[] args) {
        HR hr = new HR();
        PayrollOffice po = new PayrollOffice();

        hr.addNewEmployee(EmployeeFactory.create("Employee"));
        hr.addNewEmployee(EmployeeFactory.create("Employee"));
        hr.addNewEmployee(EmployeeFactory.create("Employee"));
        hr.addNewEmployee(EmployeeFactory.create("Manager"));
        hr.addNewEmployee(EmployeeFactory.create("Manager"));
        hr.addNewEmployee(EmployeeFactory.create("Director"));

        hr.listEmployees();

        System.out.println();

        List<Employee> employees = hr.getEmployees();

        for (Employee employee : employees) {
            po.paySalary(employee);
        }
    }

}
