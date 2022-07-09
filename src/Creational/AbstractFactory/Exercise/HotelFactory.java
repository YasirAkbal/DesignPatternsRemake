/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory.Exercise;

/**
 *
 * @author yasir
 */
public interface HotelFactory {
    public Room createRoom();
    public Reservation createReservation();
    public Payment createPayment();
}
