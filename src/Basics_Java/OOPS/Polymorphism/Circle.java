package Basics_Java.OOPS.Polymorphism;

public class Circle extends Shape {
    // method overriding run-time polymorphism
    @Override
    public void draw() {
        System.out.println("Circle...");
    }
}
