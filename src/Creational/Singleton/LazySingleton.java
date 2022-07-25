/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author yasir
 * Avantajı: getInstance metodu ilk çağrıldığı ana kadar nesne oluşturulmuyor. Oluşturulan nesnenin boyutu fazla ve oluşturulması zahmetliyse faydalı
 * Dezavantajı: Thread Safe değil
 */
public final class LazySingleton {
    private LazySingleton() {}
    
    private static LazySingleton instance;
    
    public static LazySingleton getInstance() {
        /*
        Multithread programlarda istemciler getInstance metoduna ilk ve aynı aynı anda eriştiklerinde her ikisi de if ifadesine içine girip örnek oluşturabilir.
        Bu durum sınıfın sadece tek bir örneğinin olmasının şart olduğu durumlarda sıkıntı oluşturabilir.
        */
        if(instance == null)
            instance = new LazySingleton();
        
        return instance;
    }
}
