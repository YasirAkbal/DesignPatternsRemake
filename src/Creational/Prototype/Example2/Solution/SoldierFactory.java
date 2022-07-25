/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example2.Solution;

import Creational.Prototype.Example2.Domain.MachineGun;
import Creational.Prototype.Example2.Domain.Sniper;
import Creational.Prototype.Example2.Domain.Soldier;

/**
 *
 * @author yasir
 */
public class SoldierFactory implements Factory {
  
    @Override
    public Soldier createTeamASoldier(int id) {
        Soldier soldier = Soldiers.teamASoldier.clone();
        soldier.setId(id);
        return soldier;
    }

    @Override
    public Soldier createTeamBSoldier(int id) {
        Soldier soldier = Soldiers.teamBSoldier.clone();
        soldier.setId(id);
        return soldier;
    }
   
    /*
    Farklı takımlar için askerlerin sadece vest, gun ve id değerlerinin farklı olduğu durumda her defasında diğer parametrelerin bir constructor ile geçilmesine gerek kalmadı.
    Prototype patternı var olan prototip nesnelerini klonlayarak bu sorunu ortadan kaldırdı. Artık sadece ihtiyacımız olan, farklılık gösteren alanları set etmemiz yeterli.
    */
    private static class Soldiers {
        private static final Soldier teamASoldier = new Soldier(-1,100,10,5,true,new MachineGun());
        private static final Soldier teamBSoldier = new Soldier(-1,100,10,5,false,new Sniper());
    }
}
