/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype.Example2.Domain;

/**
 *
 * @author yasir
 */
public class Soldier implements Cloneable {

    private int id;
    private int hp;
    private int speed;
    private int jumpDistance;
    private boolean hasVest;
    private Gun gun;

    public Soldier(int id, int hp, int speed, int jumpDistance, boolean hasVest, Gun gun) {
        this.id = id;
        this.hp = hp;
        this.speed = speed;
        this.jumpDistance = jumpDistance;
        this.hasVest = hasVest;
        this.gun = gun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public boolean isHasVest() {
        return hasVest;
    }

    public void setHasVest(boolean hasVest) {
        this.hasVest = hasVest;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public Soldier clone() {
        Soldier account = null;
        try {
            account = (Soldier) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return account;
    }
}
