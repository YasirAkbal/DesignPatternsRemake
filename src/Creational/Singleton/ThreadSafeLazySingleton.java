/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author yasir
 */
public class ThreadSafeLazySingleton {
    private static volatile ThreadSafeLazySingleton instance;
    private ThreadSafeLazySingleton() {}
    
    public static ThreadSafeLazySingleton getInstance() {
        if(instance == null) { //double-checked locking
            synchronized(ThreadSafeLazySingleton.class) {
                if(instance == null)
                    instance = new ThreadSafeLazySingleton();
            }
        }
   
        return instance;
    }
}
