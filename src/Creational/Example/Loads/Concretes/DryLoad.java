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
public class DryLoad extends Load {

    public DryLoad() {
    }

    public DryLoad(double quantityKg, boolean isDangerous, boolean isMilitaryCargo) {
        super(quantityKg, isDangerous, isMilitaryCargo);
    }
    
    @Override
    public DryLoad clone() {
        DryLoad account = (DryLoad) super.clone();
        return account;
    }
}
