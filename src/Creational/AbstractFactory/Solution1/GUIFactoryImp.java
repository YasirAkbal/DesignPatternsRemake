/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory.Solution1;

/**
 *
 * @author yasir
 */
public class GUIFactoryImp implements GUIFactory {

    @Override
    public Component createButton() {
        return new Button();
    }

    @Override
    public Component createList() {
        return new List();
    }

    @Override
    public Component createTable() {
        return new Table();
    }
    
}
