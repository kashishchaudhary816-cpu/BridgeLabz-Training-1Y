package com.gla.inhertance;
class Animal{
    void animalMethod(){
        System.out.println("Animal=Parent");
    }
}
class dog extends Animal{
    void dogMenthod(){
        System.out.println("Dog=child of Animal");
    }
}
class puppy extends dog{
    void puppyMethod(){
        System.out.println("puppy=child of dog");
    }
}
public class Multilevel {
    public static void main(String[] args){
        puppy sc=new puppy();
        sc.animalMethod();
        sc.dogMenthod();
        sc.puppyMethod();
    }
}