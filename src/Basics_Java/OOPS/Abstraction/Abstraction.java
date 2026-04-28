package Basics_Java.OOPS.Abstraction;

/*
 * ================================
 *        INTERFACE
 * ================================
 * - 100% abstraction (by default)
 * - Supports multiple inheritance
 * - Methods are public + abstract by default
 */
interface Electric {
    void charge();
}


/*
 * ================================
 *       ABSTRACT CLASS
 * ================================
 * - Cannot be instantiated
 * - Can have abstract + concrete methods
 * - Used for shared structure + partial abstraction
 */
abstract class Vehicle {

    // Abstract methods (must be implemented)
    abstract void start();
    abstract void drive();
    abstract void stop();

    // Concrete method (common behavior)
    void fuelType() {
        System.out.println("Vehicle has fuel system");
    }
}


/*
 * ================================
 *       CONCRETE CLASS (BIKE)
 * ================================
 */
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts");
    }

    @Override
    void drive() {
        System.out.println("Bike drives");
    }

    @Override
    void stop() {
        System.out.println("Bike stops");
    }
}


/*
 * ================================
 *   CONCRETE CLASS (ELECTRIC CAR)
 * ================================
 * - Extends abstract class
 * - Implements interface (multiple inheritance)
 */
class ElectricCar extends Vehicle implements Electric {

    @Override
    void start() {
        System.out.println("Electric Car starts silently");
    }

    @Override
    void drive() {
        System.out.println("Electric Car drives smoothly");
    }

    @Override
    void stop() {
        System.out.println("Electric Car stops");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging");
    }
}


/*
 * ================================
 *             MAIN
 * ================================
 */
public class Abstraction {

    public static void main(String[] args) {

        /*
         * =========================================
         *            UPCASTING (IMPORTANT)
         * =========================================
         * Parent reference → Child object
         * Done automatically
         */
        Vehicle v = new Bike();   // UPCASTING

        v.start();
        v.drive();
        v.stop();
        v.fuelType();

        // v.charge(); ❌ Not allowed (Vehicle doesn't know Electric)

        System.out.println("\n--- Switching Object ---");

        v = new ElectricCar();   // runtime polymorphism
        v.start();
        v.drive();

        /*
         * =========================================
         *        DOWNCASTING (IMPORTANT)
         * =========================================
         * Child reference → Parent object
         * Done manually (explicit casting)
         */

        ElectricCar ec = (ElectricCar) v;   // DOWNCASTING
        ec.charge();  // Now accessible

        /*
         * =========================================
         *     INTERFACE REFERENCE (BEST PRACTICE)
         * =========================================
         */
        Electric e = new ElectricCar();
        e.charge();

        /*
         * =========================================
         *     DANGEROUS DOWNCASTING (INTERVIEW)
         * =========================================
         */
        Vehicle v2 = new Bike();

        // ElectricCar wrong = (ElectricCar) v2; ❌ Runtime error
        // ClassCastException

        /*
         * SAFE WAY:
         */
        if (v2 instanceof ElectricCar) {
            ElectricCar safe = (ElectricCar) v2;
        } else {
            System.out.println("Downcasting not safe");
        }
    }
}