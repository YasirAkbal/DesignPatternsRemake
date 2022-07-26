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
public abstract class RailwayVehicle extends Vehicle {
    protected int numberOfVagons;
    
    public RailwayVehicle() {}

    public RailwayVehicle(int numberOfVagons) {
        this.numberOfVagons = numberOfVagons;
    }

    public RailwayVehicle(int numberOfVagons, int id, Double engineCapacity, Date productionDate, int km) {
        super(id, engineCapacity, productionDate, km);
        this.numberOfVagons = numberOfVagons;
    }

    public int getNumberOfVagons() {
        return numberOfVagons;
    }

    public void setNumberOfVagons(int numberOfVagons) {
        this.numberOfVagons = numberOfVagons;
    }
}
