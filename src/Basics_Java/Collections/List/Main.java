package Basics_Java.Collections.List;

import Basics_Java.OOPS.Abstraction.Interfaces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        System.out.println(list1);
        list1.add(20);
        System.out.println(list1);
        list1.add(30);
        System.out.println(list1);
        list1.removeFirst();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(list1);
        System.out.println(arrayList);


        System.out.println();
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1001);
        System.out.println(collection);
        collection.add(2001);
        System.out.println(collection);
        collection.add(3001);
        System.out.println(collection);
//        ((ArrayList<Integer>) collection).removeFirst();
        collection.remove(0);
        System.out.println(collection);
        collection.remove(2);
        System.out.println(collection);
        collection.remove(0);
        System.out.println(collection);

        List<Integer> itr = new ArrayList<>();
        itr.add(10);
        itr.add(11);
        itr.add(12);
        itr.add(13);

        Iterator<Integer> iterator =  itr.iterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }
    }
}
