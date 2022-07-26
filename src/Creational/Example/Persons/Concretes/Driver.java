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
public class Driver extends Person {
    public Date endOfDriverLicenseDate;

    public Driver(Date endOfDriverLicenseDate) {
        this.endOfDriverLicenseDate = endOfDriverLicenseDate;
    }

    public Driver(Date endOfDriverLicenseDate, Date createDate, boolean isConfirmed, String name, String surname, Date birthDate) {
        super(createDate, isConfirmed, name, surname, birthDate);
        this.endOfDriverLicenseDate = endOfDriverLicenseDate;
    }

    public Date getEndOfDriverLicenseDate() {
        return endOfDriverLicenseDate;
    }

    public void setEndOfDriverLicenseDate(Date endOfDriverLicenseDate) {
        this.endOfDriverLicenseDate = endOfDriverLicenseDate;
    } 
}
