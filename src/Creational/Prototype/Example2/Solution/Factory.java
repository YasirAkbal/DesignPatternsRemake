/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example2.Solution;

import Creational.Prototype.Example2.Domain.Soldier;

/**
 *
 * @author yasir
 */
public interface Factory {
    public Soldier createTeamASoldier(int id);
    
    public Soldier createTeamBSoldier(int id);
}
