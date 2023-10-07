/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MINGGU4;

/**
 *
 * @author abil
 */
public class Horse extends Animals {

    public Horse(String name, int age, String food, String gender, int alive) {
        super.name = name;
        super.age = age;
        super.food = food;
        super.gender = gender;
        super.alive = alive;
    }

    @Override
    public String printSound() {
        return "Neigh";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String printData() {
        return super.printData() + "\nSuara Hewan Ini : " + printSound();

    }
}
