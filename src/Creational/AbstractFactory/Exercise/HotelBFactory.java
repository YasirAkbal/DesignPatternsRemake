/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory.Exercise;

/**
 *
 * @author yasir
 */
public class HotelBFactory implements HotelFactory {

    @Override
    public Room createRoom() {
        return new RoomB();
    }

    @Override
    public Reservation createReservation() {
        return new ReservationB();
    }

    @Override
    public Payment createPayment() {
        return new PaymentB();
    }
    
}
