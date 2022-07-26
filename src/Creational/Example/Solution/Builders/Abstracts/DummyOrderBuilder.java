/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Builders.Abstracts;

import java.util.Date;

/**
 *
 * @author yasir
 */
public interface DummyOrderBuilder {
    public ProjectBuilder buildPrepaidOrder(int id, String customerName, Date paymentDate);
    
    public ProjectBuilder buildPostpaidOrder(int id, String customerName, Date paymentDate, Date plannedPaymentDate);  
}
