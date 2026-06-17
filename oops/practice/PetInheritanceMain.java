package com.oops.practice;

public class PetInheritanceMain {
    public static void main(String[] args) {
        AnimalInhertiance animal1 = new DogInheritance("Tob");
        AnimalInhertiance animal2 = new Cat("Kale");
        System.out.println(animal2+" "+animal2.sound());
        System.out.println(animal1+" "+animal1.sound());


    }
}
