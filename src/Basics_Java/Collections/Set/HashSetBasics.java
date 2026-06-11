package Basics_Java.Collections.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
//        Set<Integer> st = new HashSet<>();
////        st.add(10);
////        st.add(10);
////        st.add(10);
////        st.add(33);
////        st.add(33);
////        st.add(33);
////        st.add(55);
//
//        /// we get elements in random order no order follow
//        System.out.println(st);
//
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        set1.add(5);
//
//
////
////        set2.add(1);
////        set2.add(2);
////        set2.add(3);
////        set2.add(4);
////        set2.add(5);
//        set2.add(6);
//        set2.add(9);
////        set2.add(2);
//        set2.add(7);
////        set2.add(4);
//        set2.add(0);
//        System.out.println(set1);
//        System.out.println(set2);
//        set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println(set2.containsAll(set1));
//        Set<Integer> set3 = new TreeSet<>();
//        set3.addAll(set2);
//        System.out.println(set3);
//        set3.add(5);
//        set3.add(3);
//        set3.add(1);
//        System.out.println(set3);

        /// HashedSet -> O(1)
        /// LinkedHashedSet -> O(n)
        /// TreeSet -> BST -> O(log n)

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(21,"Om");
        Student s2 = new Student(21,"Om");
        Student s3= new Student(21,"Om");


        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}
class Student{
    public int rollNo;
    public String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."Student{rollNo=\{rollNo}, name='\{name}'}";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}