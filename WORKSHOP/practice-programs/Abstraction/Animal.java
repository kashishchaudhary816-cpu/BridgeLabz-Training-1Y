package Abstraction;

// Abstract class
abstract class Animal {

    // abstract method (no body)
    abstract void sound();

    // normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}
