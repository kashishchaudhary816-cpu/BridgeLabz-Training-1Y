package com.gla.inhertance;
public class AnimalExample {
    void eat() {
        System.out.println("Animal eats");
    }

    class Dog extends AnimalExample {
        void bark() {
            System.out.println("Dog bark");
        }
    }

    class Cat extends AnimalExample {
        void meow() {
            System.out.println("Cat meow");
        }
    }

}