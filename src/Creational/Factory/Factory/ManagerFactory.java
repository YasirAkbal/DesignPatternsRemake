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
public class ManagerFactory implements Factory {

    @Override
    public Manager create(String name) {
        String department = EmployeeRandomizer.createDepartment();
        Manager manager = new Manager(EmployeeRandomizer.createId(), name,
                EmployeeRandomizer.createYear(), department, department);
        return manager;
    }
}
