/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creational.Factory.Exercise.StudentFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasir
 */
public class StudentMain {

    public static void main(String[] args) {
        FullTimeStudentFactory fulltimeFactory = new FullTimeStudentFactoryImp();
        PartTimeStudentFactory partTimeFactory = new PartTimeStudentFactoryImp();
        
        List<Student> students = new ArrayList<Student>();
        
        students.add(fulltimeFactory.create("abdul", 55));
        students.add(fulltimeFactory.create("rezzak", 35));
        students.add(partTimeFactory.create("mahmut"));
        students.add(partTimeFactory.create("haydar"));
        
        for(Student student: students) {
            student.work();
            student.calculateGPA();
            System.out.println("<--------------->");
        }
    }
    
}
