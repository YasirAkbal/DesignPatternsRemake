/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Factory;

/**
 *
 * @author yasir
 * İlgili nesneler bu interface'i implement ederek kendi factory sınıflarını oluşturacak.
 * create metodu tek bir string parametresi alıyor. Oluşturulacak tüm sınıflar için bu parametre yeterliyse bir sıkıntı oluşmayacaktır. Fakat factory sınıflarını yazacak sınıfların ...
 * yapılandırıcılarına alması gereken parametreler ilerleyen zamanlarda genişleyebilir veya başlangıçta fazlaca parametre gerekebilir. Bu durumda create metodunun tüm bu parametreleri ...
 * alması gerekecektir. Parametresi fazla olan bu create metodunu uygulayan factory sınıfları dolayısıyla bu factory sınıfının sınıfları bu parametrelerin hepsine ihtiyaç duymayabilir...
 * Bu durum metotların ihtiyaçları olmayan parametreleri almasına, karmaşıklığın artmasına, SRP ve OCP prensiplerine aykırı bir durumun oluşmasına neden olacaktır.
 * Bu sorunu çözmek için tüm factoryler aynı interface'i implement etmesi yerine her factory için ayrı bir interface tanımlanabilir. Bu durumda create metotları fazla sayıda ve gereksiz...
 * parametre alma sorunundan kurtulmuş olur.
 * 
 * Factory metotları nesneleri oluşturmak için gerekli bilgileri olabildiğince kendi elde etmelidir. Parametre olarak başka bir yerden almamalıdır.
 */
public interface Factory {

    public Employee create(String name);

}
