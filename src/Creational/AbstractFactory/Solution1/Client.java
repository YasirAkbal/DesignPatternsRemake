/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory.Solution1;

/**
 *
 * @author yasir
 */
public class Client {
    public Client(GUIFactory factory) {
        Component list = factory.createList();
        list.paint();
        
        Component table = factory.createTable();
        table.paint();
        
        Component button = factory.createButton();
        button.paint();
    }
}
