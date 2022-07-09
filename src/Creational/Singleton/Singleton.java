/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author yasir
 * Thread safe fakat Singleton sınıfına başka amaçlarla ulaşılmış olsa bile instance'ı o anda yüklüyor. Bu durum Singleton sınıfının boyutunun fazla olduğu ve oluşturulması...
 * zahmetli olduğu durumlarda istenmeyebilir.
 */
public final class Singleton {
    private static final Singleton instance = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return instance;
    }
}
