/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Builder.solution;

/**
 *
 * @author yasir
 */
public interface BaseBicycleBuilderI {
    public BaseBicycleBuilderI buildBackSet();
    public BaseBicycleBuilderI buildFrontSet();
    public BaseBicycleBuilderI buildSaddleArea();
    public BaseBicycleBuilderI buildFrontWheel();
    public BaseBicycleBuilderI buildBackWheel();
    
    public SuperBicycleBuilderI buildSuperBicycle();
}
