/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Builder.solution;

/**
 *
 * @author yasir
 * süper bisiklet. harika bisiklet. ışıklı. vitesi de var
 */
public interface SuperBicycleBuilderI {
    public SuperBicycleBuilderI buildLed();
    public SuperBicycleBuilderI buildGear();
    
    public Bicycle build();
}
