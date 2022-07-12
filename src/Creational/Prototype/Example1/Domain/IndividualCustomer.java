/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example1.Domain;

import java.util.Date;


/**
 *
 * @author yasir
 */
public class IndividualCustomer extends Customer {
    private String firstName;
    private String lastName;
    private Date dob;

    public IndividualCustomer(int id, String address, String phone, boolean authenticated, boolean validated, Date membershipDate, String firstName,
            String lastName, Date dob) {
        super(id, address, phone, authenticated, validated, membershipDate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "IndividualCustomer [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", id=" + id + ", address=" + address
                + ", phone=" + phone + ", authenticated=" + authenticated + ", validated=" + validated + ", membershipDate=" + membershipDate + "]";
    }
    
    
    //Bloch'un factory pattern yaklaşımı ile prototype patternının birlikte kullanılması. (bir diğer yöntem)
    public IndividualCustomer cloneAuthenticatedAndValidatedIndividualCustomer() {
        IndividualCustomer customer = null;
        customer = (IndividualCustomer) super.clone();
        customer.setAuthenticated(true);
        customer.setValidated(true);
        return customer;
    }
    
    @Override
    public IndividualCustomer clone() {
        IndividualCustomer individualCustomer = (IndividualCustomer)super.clone();
        return individualCustomer;
    }
}
