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
public abstract class Customer implements Cloneable {

    protected int id;
    protected String address;
    protected String phone;
    protected boolean authenticated;
    protected boolean validated;
    protected Date membershipDate;

    public Customer(int id, String address, String phone, boolean authenticated, boolean validated, Date membershipDate) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.authenticated = authenticated;
        this.validated = validated;
        this.membershipDate = membershipDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Date getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }

    @Override
    public Customer clone() {
        Customer customer = null;
        try {
            customer = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return customer;
    }
}
