package Basics_Java.OOPS.Polymorphism;

abstract class Vehicle {
    abstract void start();
    abstract void drive();
    abstract void stop();
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike is Started...");
    }
    @Override
    void drive(){
        System.out.println("Bike is drive...");

    }
    @Override
    void stop(){
        System.out.println("Bike is Stopped...");
    }
}

