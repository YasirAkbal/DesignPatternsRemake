/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example1.Solution;

import Creational.Prototype.Example1.Domain.CorporateCustomer;
import Creational.Prototype.Example1.Domain.Customer;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class CorporateCustomerFactoryImp implements CorporateCustomerFactory{
    private static final CorporateCustomer prototype = new CorporateCustomer(100, "dummy", "2124134047", false, false, new Date(), "GE", 0.25);
    
    @Override
    public Customer create() {
        return prototype.clone();
    }

    @Override
    public Customer create(int id, String address, String phone, Date membershipDate, String corporateName, double discount) {
        CorporateCustomer newCorporateCustomer = prototype.clone();
        
        newCorporateCustomer.setId(id);
        newCorporateCustomer.setAddress(address);
        newCorporateCustomer.setPhone(phone);
        newCorporateCustomer.setMembershipDate(membershipDate);
        newCorporateCustomer.setCorporateName(corporateName);
        newCorporateCustomer.setDiscount(discount);
        
        return prototype;
    }

}
