/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Exercise.StudentFactory;

/**
 *
 * @author yasir
 */
public class FullTimeStudentFactoryImp implements FullTimeStudentFactory {

    @Override
    public Student create(String name, double ticketBalance) { 
        return new FullTimeStudent(name, ticketBalance);
    }
    
}
