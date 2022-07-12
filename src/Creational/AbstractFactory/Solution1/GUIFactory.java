/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory.Solution1;

/**
 *
 * @author yasir
 * Factory metotunda yapılan bir metot ile nesne oluşturma aşamalarını client'ten soyutlamak iken Abstract Factory metotunda bu işlem sınıflar ile yapılır...
 * Abstract Factory sınıfları içinde farklı tipte nesneleri oluşturan farklı metotlar bulunur. Bu özelliğinden dolayı factory metotuna abstract factory'nin özel durumu diyebiliriz...
 * Abstract factory bir sınıf ailesinin oluşturulmasını soyutlamaktan sorumludur. Bu aile ortak bir ataya(ortak interface veya sınıf olma durumu) sahip olabileceği gibi...
 * ortak bir ataya sahip olmayan ama kavramsal olarak gruplayabileceğimiz sınıflardan da oluşabilir. Ayrıca bu bahsedilen aile sayısı da birden fazla olabilir. Bu durumda tek bir...
 * abstract factory soyutlaması kullanılacağı gibi gerektiğinde bu soyutlama sayısı arttırabilir.
 * Bu örnek ortak bir ataya sahip, tek bir aile grubunun olduğu senaryo için abstract factory uygulanmıştır.
 */
public interface GUIFactory {
    public Component createButton();
    public Component createList();
    public Component createTable();
}
