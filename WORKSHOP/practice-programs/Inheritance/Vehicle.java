class Vehicle {
    void start(){
        System.out.println( "Vehicle is start ");
    }

}
class Car extends Vehicle {
    void fast () {
        System.out.println("Car is fast ");
    }
}

public class singleLevel {
    public static void main (String[] args){
        Car c1 = new Car();
        c1.fast();
        c1.start();
    }
}