/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Exercise.StudentFactory;

/**
 *
 * @author yasir
 */
public class PartTimeStudentFactoryImp implements PartTimeStudentFactory {

    @Override
    public Student create(String name) {
        return new PartTimeStudent(name);
    }
    
}
