/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example1.Solution;

import Creational.Prototype.Example1.Domain.Customer;
import Creational.Prototype.Example1.Domain.IndividualCustomer;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class IndividualCustomerFactoryImp implements IndividualCustomerFactory {
    private static final IndividualCustomer prototype = new IndividualCustomer(1, "dummy address", "dummy phone", false, false, new Date(), "dummy name", "dummy lastname", new Date());
    
    @Override
    public Customer create() {
        return prototype.clone();
    }

    @Override
    public Customer create(int id, String address, String phone, Date membershipDate, String firstName, String lastName, Date dob) {
        IndividualCustomer newIndividualCustomer = prototype.clone();
        
        newIndividualCustomer.setId(id);
        newIndividualCustomer.setAddress(address);
        newIndividualCustomer.setPhone(phone);
        newIndividualCustomer.setMembershipDate(membershipDate);
        newIndividualCustomer.setFirstName(firstName);
        newIndividualCustomer.setLastName(lastName);
        newIndividualCustomer.setDob(dob);
        
        return newIndividualCustomer;
    }
    
}
