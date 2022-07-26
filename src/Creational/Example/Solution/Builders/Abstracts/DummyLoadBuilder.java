/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Builders.Abstracts;

/**
 *
 * @author yasir
 */
public interface DummyLoadBuilder {
    public ProjectBuilder buildDryLoad(double quantity);
    public ProjectBuilder buildDryDangerousLoad(double quantity);
    public ProjectBuilder buildDryMilitaryLoad(double quantity);
    
    public ProjectBuilder buildLiquidLoad(double quantity, double density);
    public ProjectBuilder buildLiquidDangerousLoad(double quantity, double density);
    public ProjectBuilder buildLiquidMilitaryLoad(double quantity, double density);
}
