/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creational.Example;

import Creational.Example.Projects.Project;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Project project = Project.getBuilder(1, new Date(), "Ankara")
                .getLoadBuilder().buildDryMilitaryLoad(35.1)
                .getOrderBuilder().buildPrepaidOrder(3, "Yasir", new Date())
                .buildManager("name", "surname", new Date())
                .buildDriver(new Date(), "name", "surname", new Date())
                .getVehicleBuilder().buildTruck("34 KM 451", 3, 1.5, new Date(), 35151)
                .build();
       
        System.out.println(project.getDriver().getName());
        System.out.println(project.getCreateDate());
        System.out.println(project.getVehicle().getKm());
    }
    
}
