/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Factory;

import Creational.Factory.EmployeeRandomizer;

/**
 *
 * @author yasir
 */
public class EmployeeFactory implements Factory {

    @Override
    public Employee create(String name) {
        Employee employee = new Employee(EmployeeRandomizer.createId(), name,
                EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
        return employee;
    }
}
