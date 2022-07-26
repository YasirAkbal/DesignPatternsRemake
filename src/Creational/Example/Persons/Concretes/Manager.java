/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Persons.Concretes;

import Creational.Example.Persons.Abstracts.Person;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Manager extends Person {

    public Manager() {
    }

    public Manager(Date createDate, boolean isConfirmed, String name, String surname, Date birthDate) {
        super(createDate, isConfirmed, name, surname, birthDate);
    }

}
