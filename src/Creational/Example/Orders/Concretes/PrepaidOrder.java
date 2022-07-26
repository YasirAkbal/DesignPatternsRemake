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
public class PrepaidOrder extends Order {

    public PrepaidOrder() {
    }

    public PrepaidOrder(int id, Date issueDate, String customerName, Date paymentDate) {
        super(id, issueDate, customerName, paymentDate);
    }
    
}
