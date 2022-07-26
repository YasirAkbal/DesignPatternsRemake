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
public abstract class HighwayVehicle extends Vehicle {
    protected String plate;

    public HighwayVehicle() {}
    
    public HighwayVehicle(String plate) {
        this.plate = plate;
    }

    public HighwayVehicle(String plate, int id, Double engineCapacity, Date productionDate, int km) {
        super(id, engineCapacity, productionDate, km);
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }  
}
