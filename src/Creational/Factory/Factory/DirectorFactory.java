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
public class DirectorFactory implements Factory {

    @Override
    public Director create(String name) {
        Director director = new Director(EmployeeRandomizer.createId(), name,
                EmployeeRandomizer.createYear(), "Management", "Management", 5000);
        return director;
    }

}
