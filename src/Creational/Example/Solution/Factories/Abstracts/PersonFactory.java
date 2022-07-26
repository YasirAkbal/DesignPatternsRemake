/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Factories.Abstracts;

import Creational.Example.Persons.Abstracts.Person;
import java.util.Date;

/**
 *
 * @author yasir
 */
public interface PersonFactory {
    public Person createDriver(Date endOfDriverLicenseDate, String name, String surname, Date birthDate);
    
    public Person createManager(String name, String surname, Date birthDate);
}
