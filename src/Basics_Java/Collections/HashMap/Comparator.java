package Basics_Java.Collections.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator  {
    /*
    Comparable Interface:

. Purpose: Defines a natural ordering for the objects of the classes that implement it.
. Method to Implement: compareTo(T o)
. Functionality: This method compares the current object with the specified object to
determine their order.
· Return Value: Returns a negative integer, zero, or a positive integer as this object is less
than, equal to, or greater than the specified object, respectively.
. Usage Context: Useful when there is a single, natural ordering of the objects (e.g.,
alphabetical order for strings, numerical order for numbers).
. Integration: Automatically used by sorting methods in collections that do not specify a
custom comparator (e.g., Collections.sort(list) when sorting a list of objects that implement
Comparable).
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "p1", 70));
        students.add(new Student(21, "sahil", 57));
        students.add(new Student(22, "Om", 58));
        System.out.println("Before Sort: "+students);
//        Collections.sort(students, (a,b) -> b.age - a.age);
        /// ascending
        students.sort(java.util.Comparator.comparing(Student::getAge));
        System.out.println("Ascending: "+ students);

        /// descending
        students.sort(java.util.Comparator.comparing(Student::getAge).reversed());
        System.out.println("Descending: "+ students);
    }
}

class Student  {
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Student{age=" + age + ", name='" + name + "', weight=" + weight + "}";
    }
    Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    @Override
//    public int compareTo(Student that) {
////        return this.weight + that.weight;
//        return Integer.compare(this.weight, that.weight);
//
//    }

//    @Override
//    public int compareTo(Student that) {
//
//        return this.age - that.age;
//    }
}