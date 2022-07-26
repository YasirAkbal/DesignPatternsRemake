/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Example.Solution.Builders.Abstracts;

import Creational.Example.Projects.Project;
import java.util.Date;

/**
 *
 * @author yasir
 * kendime not:
 * Project sınıfının bazı üyeleri(load, order vs.) poliformik ilişkiye sahip. Örneğin 2 farklı load türünü temsil eden 2 farklı alt sınıf mevcut: Dry ve Luquid Load.
 * Bu gruplamalar farklı türde nesneler oluşturulmasına sebep oluyor. Bunların hepsini project builder içinde tek tek yakalasaydım çok fazla metotum olurdu. Onun yerine bunlar...
 * için farklı builderlar tanımladım. Aslında bu tanımladığım builderlar gerçekten builderlık görevini icra etmiyor. Zaten ilgili tipler için hali hazırda yazılmış factory...
 * metotlarını çağırıyor. Bu yüzden onlara dummy builder dedim. Project için yazmak istediğim builderı gerçekleştirebilmek için bunlar için bunlara ihtiyaç duydum...
 * Oysaki onlara ait factoryler zaten nesne oluşturma görevini üsteleniyor. Bu sınıflar sadece project sınıfı içinde değil tek başlarına da kullanılabilecekleri için...
 * kendilerine ait factoryleri olması zaten gerekliydi.
 */
public interface ProjectBuilder {
    public DummyLoadBuilder getLoadBuilder();
    public DummyOrderBuilder getOrderBuilder();
    public DummyVehicleBuilder getVehicleBuilder();
    
    public ProjectBuilder buildDriver(Date endOfDriverLicenseDate, String name, String surname, Date birthDate);
    public ProjectBuilder buildManager(String name, String surname, Date birthDate);
    public Project build();
}
