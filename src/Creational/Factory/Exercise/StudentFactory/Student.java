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
public abstract class Student {
    protected int no;
    protected String name;
    protected Date createDate;
    private static int studentCount = 0;
    
    Student(String name) {
        this.no = ++studentCount;
        this.name = name;
        this.createDate = new Date();
    }
    
    public abstract void work();
    
    public abstract void calculateGPA();
}
