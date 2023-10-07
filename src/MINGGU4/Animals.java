/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MINGGU4;

/**
 *
 * @author abil
 */
public abstract class Animals implements AnimalsInterface {

    String name;
    int age;
    String food;
    String gender;
    int alive;

    public abstract String printSound();

    public String printData() {
        return "Jenis Parent : " + Animals.class.getSimpleName()
                + "\nJenis Child : " + getClass().getSimpleName()
                + "\nName : " + this.name
                + "\nAge : " + this.age
                + "\nFood : " + this.food
                + "\nGender : " + this.gender
                + "\nAlive : " + isAlive();
    }
}
