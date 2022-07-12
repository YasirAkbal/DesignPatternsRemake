/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example1.Solution;

import Creational.Prototype.Example1.Domain.Customer;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Main {
    CorporateCustomerFactory corporateCustomerFactory = new CorporateCustomerFactoryImp();
    IndividualCustomerFactory individualCustomerFactory = new IndividualCustomerFactoryImp();
    
    /*
    Customer alt tipi oluştururken "authenticated" ve "validated" alanları için her defasında parametre geçilmek yerine var olan prototiplerden faydalanıldı.
    Prototipler Factory'ler içinde tutuluyor. Prototype ve factory/abstract factory patternları birlikte kullanıldığında faydası daha da artmaktadır.
    */
     
    Customer corporateCustomer1 = corporateCustomerFactory.create();
    Customer corporateCustomer2 = corporateCustomerFactory.create(1, "dummy", "123145", new Date(), "selam", 0);
    
    Customer individualCustomer1 = individualCustomerFactory.create();
    Customer individualCustomer2 = individualCustomerFactory.create(3, "dummy", "23351", new Date(), "yasir", "akbal", new Date());
}
