/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Solution.Factories.Concretes;

import Creational.Example.Persons.Abstracts.Person;
import Creational.Example.Persons.Concretes.Driver;
import Creational.Example.Persons.Concretes.Manager;
import Creational.Example.Solution.Factories.Abstracts.PersonFactory;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class PersonFactoryImp implements PersonFactory {
    private MernisService mernisService = new MernisService(); // normalde burada dependency injection yapılır.
    
    @Override
    public Driver createDriver(Date endOfDriverLicenseDate, String name, String surname, Date birthDate) {
        Date createDate = new Date();
        boolean isConfirmed = mernisService.confirm(name, surname, birthDate);
        return new Driver(endOfDriverLicenseDate, createDate, isConfirmed, name, surname, birthDate);
    }

    @Override
    public Manager createManager(String name, String surname, Date birthDate) {
        Date createDate = new Date();
        boolean isConfirmed = mernisService.confirm(name, surname, birthDate);
        return new Manager(createDate, isConfirmed, name, surname, birthDate);
    }
}

class MernisService { //dummy class
    public boolean confirm(String name, String surname, Date bithDate) { 
        return name.hashCode() % 2 == 0;
    }
}
