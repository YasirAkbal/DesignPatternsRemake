/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Orders.Concretes;

import Creational.Example.Orders.Abstracts.Order;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class PostpaidOrder extends Order {
    private Date plannedPaymentDate;

    public PostpaidOrder(Date plannedPaymentDate) {
        this.plannedPaymentDate = plannedPaymentDate;
    }

    public PostpaidOrder(Date plannedPaymentDate, int id, Date issueDate, String customerName) {
        super(id, issueDate, customerName, null);
        this.plannedPaymentDate = plannedPaymentDate;
    }  
}
