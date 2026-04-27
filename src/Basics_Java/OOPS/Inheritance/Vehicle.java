package Basics_Java.OOPS.Inheritance;


public class Vehicle {
    public int noOfTyre;
    public String name;
    public int model;

    Vehicle(){

    }
    Vehicle(int noOfTyre,String name,int model){
        this.model = model;
        this.name = name;
        this.noOfTyre = noOfTyre;
    }


    public void start() {
        System.out.println("Vehicle started: "+ name);
    }
    public void stop(){
        System.out.println("Vehicle stoped: "+ name);
    }

}
