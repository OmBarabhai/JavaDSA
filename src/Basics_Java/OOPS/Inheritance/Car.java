package Basics_Java.OOPS.Inheritance;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, int noOfTyre, int model, int noOfDoors, String transmissionType) {
        super(noOfTyre, name, model);
        this.transmissionType = transmissionType;
        this.noOfDoors = noOfDoors;
    }

    public void startAc() {
        System.out.println("Ac started in: " + name);
    }
}
