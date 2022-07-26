/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Loads.Abstracts;

/**
 *
 * @author yasir
 */
public abstract class Load implements Cloneable {

    protected double quantityKg;
    protected boolean isDangerous;
    protected boolean isMilitaryCargo; // askeri kargoysa ayrıca tehlikelidir.

    public Load() {
    }

    public Load(double quantityKg, boolean isDangerous, boolean isMilitaryCargo) {
        this.quantityKg = quantityKg;
        this.isDangerous = isDangerous;
        this.isMilitaryCargo = isMilitaryCargo;
    }

    public double getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(double quantityKg) {
        this.quantityKg = quantityKg;
    }

    public boolean isIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public boolean isMilitaryCargo() {
        return isMilitaryCargo;
    }

    public void setIsMilitaryCargo(boolean isMilitaryCargo) {
        this.isMilitaryCargo = isMilitaryCargo;
    }

    @Override
    public Load clone() {
        Load account = null;
        try {
            account = (Load) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return account;
    }
}
