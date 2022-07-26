/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Factories.Abstracts;

import Creational.Example.Loads.Abstracts.Load;

/**
 *
 * @author yasir
 */
public interface LoadFactory {
    public Load createDryLoad(double quantity);
    public Load createDryDangerousLoad(double quantity);
    public Load createDryMilitaryLoad(double quantity);
    
    public Load createLiquidLoad(double quantity, double density);
    public Load createLiquidDangerousLoad(double quantity, double density);
    public Load createLiquidMilitaryLoad(double quantity, double density);
}
