/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author yasir
 * Singleton deseni thread-safe ve lazy olarak tasarlanmış olsa bile başka sıkıntıları vardır: Reflection ve serialization ile sınıfın farklı nesneler oluşturabilir.
 * Singleton olarak tasarlanmak istenen yapı enum olarak tasarlanırsa bu sorunlar da ortadan kaldırılabilir.
 */
public enum EnumSingleton {
    SINGLETON;
    
    public int i = 1;
    public String s = "string";
    
    public void work() { }
}
