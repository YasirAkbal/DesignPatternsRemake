/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Solution.Factories.Concretes;

import Creational.Example.Orders.Abstracts.Order;
import Creational.Example.Orders.Concretes.PostpaidOrder;
import Creational.Example.Orders.Concretes.PrepaidOrder;
import Creational.Example.Solution.Factories.Abstracts.OrderFactory;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class OrderFactoryImp implements OrderFactory {

    @Override
    public Order createPrepaidOrder(int id, String customerName, Date paymentDate) {
        return new PrepaidOrder(id, new Date(), customerName, paymentDate);
    }

    @Override
    public Order createPostpaidOrder(int id, String customerName, Date paymentDate, Date plannedPaymentDate) {
        return new PostpaidOrder(plannedPaymentDate, id, new Date(), customerName);
    }
    
}
