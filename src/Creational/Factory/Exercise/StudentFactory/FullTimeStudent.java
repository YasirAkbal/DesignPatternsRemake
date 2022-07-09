/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Exercise.StudentFactory;

/**
 *
 * @author yasir
 */
public class FullTimeStudent extends Student{
    private double ticketBalance;
    
    public FullTimeStudent(String name, double ticketBalance) {
        super(name);
        this.ticketBalance = ticketBalance;
    }
    
    @Override
    public void work() {
        System.out.println(String.format("Fulltime Student %s is working", name));
    }
    
    @Override
    public void calculateGPA() {
        double gpa = 1.8 + Math.random() * (4.0 - 1.82);
        System.out.println(String.format("%s's GPA is %f", name, gpa));
    } 
}
