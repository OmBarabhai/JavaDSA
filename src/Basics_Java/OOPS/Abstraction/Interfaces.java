package Basics_Java.OOPS.Abstraction;

/*
 * INTERFACE:
 * - Used to achieve 100% abstraction
 * - Contains only abstract methods (by default public & abstract)
 * - Cannot have object creation
 */
interface Bird {
    void fly();   // behavior specific to birds
    void eat();   // common behavior
}

/*
 * Another interface
 */
interface Animal {
    void sleep(); // common behavior
    void walk();  // behavior for animals
}

/*
 * CLASS IMPLEMENTING MULTIPLE INTERFACES
 * - Java supports multiple inheritance via interfaces
 */
class Eagle implements Animal, Bird {

    // Must implement ALL methods of both interfaces

    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeps");
    }

    @Override
    public void walk() {
        System.out.println("Eagle walks");
    }
}

/*
 * Another class implementing same interfaces
 */
class Sparrow implements Animal, Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow sleeps");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow walks");
    }
}

/*
 * MAIN CLASS
 */
public class Interfaces
{

    public static void main(String[] args) {

        /*
         * RUNTIME POLYMORPHISM:
         * - Parent reference (interface) holding child object
         * - Method calls decided at runtime
         */
        Bird b = new Eagle();
        b.fly();   // Eagle version
        b.eat();

        // Switching object at runtime
        b = new Sparrow();
        b.fly();   // Sparrow version
        b.eat();

        System.out.println();

        /*
         * IMPORTANT:
         * - Bird reference → can access only Bird methods
         * - Cannot access sleep(), walk()
         */

        /*
         * ACCESSING OTHER INTERFACE METHODS USING CASTING
         */
        Animal a = (Animal) b; // downcasting
        a.sleep();
        a.walk();

        System.out.println();

        /*
         * USING CONCRETE CLASS (LESS FLEXIBLE)
         * - Direct access to all methods
         * - But breaks abstraction
         */
        Eagle e1 = new Eagle();
        e1.fly();
        e1.eat();
        e1.sleep();
        e1.walk();

        System.out.println();

        /*
         * BEST PRACTICE:
         * - Prefer interface reference over concrete class
         */
        Animal a2 = new Sparrow();
        a2.sleep();
        a2.walk();
    }
}