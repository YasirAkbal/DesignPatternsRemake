/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Solution.Factories.Concretes;

import Creational.Example.Solution.Factories.Abstracts.VehicleFactory;
import Creational.Example.Vehicles.Concretes.*;
import java.util.Date;

/**
 *
 * @author yasir
 * Burada dışarıdan alınan veriler ile direkt nesne oluşturulduğu için pek factory method pek gerekli gözükmüyor. Ama gerekli verileri factoryinin kendisi elde ettiği durumlarda...
 * factory methodlar anlam kazanacak.
 */
public class VehicleFactoryImp implements VehicleFactory {

    @Override
    public Lorry createLorry(String plate, int id, Double engineCapacity, Date productionDate, int km) {
        return new Lorry(plate, id, engineCapacity, productionDate, km);
    }

    @Override
    public Tanker createTanker(String plate, int id, Double engineCapacity, Date productionDate, int km) {
        return new Tanker(plate, id, engineCapacity, productionDate, km);
    }

    @Override
    public Truck createTruck(String plate, int id, Double engineCapacity, Date productionDate, int km) {
        return new Truck(plate, id, engineCapacity, productionDate, km);
    }

    @Override
    public Train createTrain(int numberOfVagons, int id, Double engineCapacity, Date productionDate, int km) {
        return new Train(numberOfVagons, id, engineCapacity, productionDate, km);
    } 
    
}
