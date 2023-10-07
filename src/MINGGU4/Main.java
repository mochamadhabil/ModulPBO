/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MINGGU4;

/**
 *
 * @author abil
 */
public class Main {

    public void cek(Animals animals) {
        System.out.println("==============================================");

        if (animals instanceof Cat) {
            Cat cat = (Cat) animals;
            System.out.println(cat.printData());
        } else if (animals instanceof Dog) {
            Dog dog = (Dog) animals;
            System.out.println(dog.printData());
        } else if (animals instanceof Duck) {
            Duck duck = (Duck) animals;
            System.out.println(duck.printData());
        } else if (animals instanceof Horse) {
            Horse horse = (Horse) animals;
            System.out.println(horse.printData());
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();

        //Objek dari class Cat
        Cat aiko = new Cat("Aiko", 2, "Whiskas", "Jantan", 1);
        Cat selly = new Cat("Selly", 2, "Dry Food Coucou", "Betina", 0);

        mainClass.cek(aiko);
        mainClass.cek(selly);

        //Objek dari class Dog
        Dog bruno = new Dog("Bruno", 5, "Pedigree", "Jantan", 1);
        Dog chiko = new Dog("Chiko", 8, "Chia Seed", "Jantan", 0);

        mainClass.cek(bruno);
        mainClass.cek(chiko);

        //Objek dari class Duck
        Duck coco = new Duck("Coco", 4, "Sorgul", "Jantan", 1);
        Duck dexter = new Duck("Dexter", 3, "Bekatul", "Jantan", 0);

        mainClass.cek(coco);
        mainClass.cek(dexter);

        //Objek dari class Horse
        Horse billy = new Horse("Billy", 7, "Grass", "Jantan", 1);
        Horse apolo = new Horse("Apolo", 6, "Grass", "Jantan", 0);

        mainClass.cek(billy);
        mainClass.cek(apolo);

    }

}
