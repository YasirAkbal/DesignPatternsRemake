/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Factories.Abstracts;

import Creational.Example.Vehicles.Abstracts.Vehicle;
import java.util.Date;

/**
 *
 * @author yasir
 */
public interface VehicleFactory {
    public Vehicle createLorry(String plate, int id, Double engineCapacity, Date productionDate, int km);
    public Vehicle createTanker(String plate, int id, Double engineCapacity, Date productionDate, int km);
    public Vehicle createTruck(String plate, int id, Double engineCapacity, Date productionDate, int km);  
    public Vehicle createTrain(int numberOfVagons, int id, Double engineCapacity, Date productionDate, int km);
}
