/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Exercise.StudentFactory;

import java.util.Date;

/**
 *
 * @author yasir
 */
public class PartTimeStudent extends Student {
    public PartTimeStudent(String name) {
        super(name);
    }
    
    @Override
    public void work() {
        System.out.println(String.format("Parttime Student %s is working", name));
    }
    
    @Override
    public void calculateGPA() {
        double gpa = 1.2 + Math.random() * (3.0 - 1.2);
        System.out.println(String.format("%s's GPA is %f", name,gpa));
    }
}
