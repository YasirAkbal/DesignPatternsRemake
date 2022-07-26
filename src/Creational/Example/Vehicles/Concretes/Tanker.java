/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Vehicles.Concretes;

import Creational.Example.Vehicles.Abstracts.HighwayVehicle;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Tanker extends HighwayVehicle {

    public Tanker() {
    }

    public Tanker(String plate) {
        super(plate);
    }

    public Tanker(String plate, int id, Double engineCapacity, Date productionDate, int km) {
        super(plate, id, engineCapacity, productionDate, km);
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
