/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Loads.Concretes;

import Creational.Example.Loads.Abstracts.Load;

/**
 *
 * @author yasir
 */
public class LiquidLoad extends Load {
    protected double density;

    public LiquidLoad() {}
    
    public LiquidLoad(double density) {
        this.density = density;
    }

    public LiquidLoad(double density, double quantityKg, boolean isDangerous, boolean isMilitaryCargo) {
        super(quantityKg, isDangerous, isMilitaryCargo);
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
    
    public double converToLiter() {
        return this.quantityKg / this.density;
    }
    
    @Override
    public LiquidLoad clone() {
        LiquidLoad account = (LiquidLoad) super.clone();
        return account;
    }
}
