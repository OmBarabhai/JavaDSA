package Basics_Java.OOPS.Polymorphism;

public class Sum {
    //method overloading compile-time polymorphism
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b,int c) {
        return a + b + c;
    }

}
