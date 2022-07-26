/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Persons.Abstracts;

import java.util.Date;

/**
 *
 * @author yasir
 */

public abstract class Person {
    protected Date createDate;
    protected boolean isConfirmed; //devlet servislerinden doğrulanmış mı?
    protected String name;
    protected String surname;
    protected Date birthDate;

    public Person() {}

    public Person(Date createDate, boolean isConfirmed, String name, String surname, Date birthDate) {
        this.createDate = createDate;
        this.isConfirmed = isConfirmed;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}
