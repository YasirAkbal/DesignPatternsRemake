/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.StaticFactory;

import Creational.Factory.EmployeeRandomizer;
import Creational.Factory.Factory.Director;
import Creational.Factory.Factory.Employee;
import Creational.Factory.Factory.Manager;

/**
 *
 * @author yasir
 * Factory kalıbı tek bir statik metotla uygulanırsa bu metotun SRP ve OCP'si düşük olacaktır. Bu tek bir metot farklı metotlar farklı alt sınıfları oluşturacak şekilde bölünebilir...
 * Bu çözüm metotların SRP'sini arttırsa da sınıf için hala sıkıntılı bir durum olacaktır.
 */
public class EmployeeFactory {

    public static Employee create(String type) {
        Employee employee = null;
        int id = EmployeeRandomizer.createId();
        String name = EmployeeRandomizer.createName();
        int year = EmployeeRandomizer.createYear();

        String department = EmployeeRandomizer.createDepartment();
        switch (type) {
            case "Employee":
                employee = new Employee(id, name, year, department);
                break;

            case "Manager":
                employee = new Manager(id, name, year, department, department);
                break;

            case "Director":
                employee = new Director(id, name, year, "Management", "Management", 5000);
                break;
        }
        return employee;
    }
}
