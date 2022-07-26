/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Vehicles.Concretes;

import Creational.Example.Vehicles.Abstracts.RailwayVehicle;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Train extends RailwayVehicle {

    public Train() {
    }

    public Train(int numberOfVagons) {
        super(numberOfVagons);
    }

    public Train(int numberOfVagons, int id, Double engineCapacity, Date productionDate, int km) {
        super(numberOfVagons, id, engineCapacity, productionDate, km);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
