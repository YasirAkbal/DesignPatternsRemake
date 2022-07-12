/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example1.Solution;

import Creational.Prototype.Example1.Domain.Customer;
import java.util.Date;

/**
 *
 * @author yasir
 */
public interface IndividualCustomerFactory {
    public Customer create();
    
    public Customer create(int id, String address, String phone, Date membershipDate, String firstName, String lastName, Date dob);  
}
