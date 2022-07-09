/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory.Exercise;

/**
 *
 * @author yasir
 */
public class HotelAFactory implements HotelFactory {
    
    @Override
    public Room createRoom() {
        return new RoomA();
    }

    @Override
    public Reservation createReservation() {
        return new ReservationA();
    }

    @Override
    public Payment createPayment() {
        return new PaymentA();
    } 
}
