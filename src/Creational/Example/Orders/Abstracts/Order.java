/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Orders.Abstracts;

import Creational.Example.Persons.Concretes.Driver;
import Creational.Example.Loads.Abstracts.Load;
import Creational.Example.Vehicles.Abstracts.Vehicle;
import java.util.Date;

/**
 *
 * @author yasir
 */
public abstract class Order {
    protected int id;
    protected Date issueDate;
    protected String customerName;
    protected Date paymentDate;

    public Order() {
    }

    public Order(int id, Date issueDate, String customerName, Date paymentDate) {
        this.id = id;
        this.issueDate = issueDate;
        this.customerName = customerName;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }  
}
