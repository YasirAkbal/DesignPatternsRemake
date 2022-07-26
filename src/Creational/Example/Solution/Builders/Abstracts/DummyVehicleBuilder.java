/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Builders.Abstracts;

import java.util.Date;

/**
 *
 * @author yasir
 */
public interface DummyVehicleBuilder {
    public ProjectBuilder buildLorry(String plate, int id, Double engineCapacity, Date productionDate, int km);
    public ProjectBuilder buildTanker(String plate, int id, Double engineCapacity, Date productionDate, int km);
    public ProjectBuilder buildTruck(String plate, int id, Double engineCapacity, Date productionDate, int km);
    public ProjectBuilder buildTrain(int numberOfVagons, int id, Double engineCapacity, Date productionDate, int km);
}
