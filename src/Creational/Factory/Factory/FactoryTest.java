/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creational.Factory.Factory;

import java.util.List;

/**
 *
 * @author yasir
 */
public class FactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HR hr = new HR();
        PayrollOffice po = new PayrollOffice();

        Factory employeeFactory = new EmployeeFactory();
        Factory managerFactory = new ManagerFactory();
        Factory directorFactory = new DirectorFactory();

        // Add more employees
        hr.addNewEmployee(employeeFactory.create("Ali"));
        hr.addNewEmployee(employeeFactory.create("Lale"));
        hr.addNewEmployee(employeeFactory.create("Metin"));
        hr.addNewEmployee(managerFactory.create("Kemal"));
        hr.addNewEmployee(managerFactory.create("Betul"));
        hr.addNewEmployee(directorFactory.create("sami"));

        hr.listEmployees();

        System.out.println();

        // Now pay time!
        List<Employee> employees = hr.getEmployees();

        for (Employee employee : employees) {
            po.paySalary(employee);
        }
    }

}
