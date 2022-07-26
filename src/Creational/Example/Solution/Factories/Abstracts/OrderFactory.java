/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Factories.Abstracts;

import Creational.Example.Orders.Abstracts.Order;
import java.util.Date;

/**
 *
 * @author yasir
 */
public interface OrderFactory {
    public Order createPrepaidOrder(int id, String customerName, Date paymentDate);
    
    public Order createPostpaidOrder(int id, String customerName, Date paymentDate, Date plannedPaymentDate);
}
