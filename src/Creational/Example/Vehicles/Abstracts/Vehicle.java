/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Vehicles.Abstracts;

import java.util.Date;

/**
 *
 * @author yasir
 */
public abstract class Vehicle {
    protected int id;
    protected Double engineCapacity;
    protected Date productionDate;
    protected int km;

    public Vehicle() {}

    public Vehicle(int id, Double engineCapacity, Date productionDate, int km) {
        this.id = id;
        this.engineCapacity = engineCapacity;
        this.productionDate = productionDate;
        this.km = km;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    public abstract void run();
}
