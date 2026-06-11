package Basics_Java.Collections.List;

import Basics_Java.OOPS.Abstraction.Interfaces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        System.out.println(list1);
//        list1.add(20);
//        System.out.println(list1);
//        list1.add(30);
//        System.out.println(list1);
//        list1.removeFirst();
//        System.out.println(list1);
//        list1.removeLast();
//        System.out.println(list1);
//        list1.remove(0);
//        System.out.println(list1);
//        System.out.println();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.addAll(list1);
//        System.out.println(arrayList);
//
//
//        System.out.println();
//        Collection<Integer> collection = new ArrayList<>();
//        collection.add(1001);
//        System.out.println(collection);
//        collection.add(2001);
//        System.out.println(collection);
//        collection.add(3001);
//        System.out.println(collection);
////        ((ArrayList<Integer>) collection).removeFirst();
//        collection.remove(0);
//        System.out.println(collection);
//        collection.remove(2);
//        System.out.println(collection);
//        collection.remove(0);
//        System.out.println(collection);

        ArrayList<Integer> itr = new ArrayList<>();
        itr.add(100);
        itr.add(191);
        itr.add(142);
        itr.add(139);

//        Iterator<Integer> iterator =  itr.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element: "+ iterator.next());
//        }

//        Object[] arr = itr.toArray();
//        System.out.print("[");
//        for(Object obj : arr){
//            System.out.print(obj);
//            if(obj < arr.length - 1){
//                System.out.print(", ");
//            }
//
//        }
//        System.out.print("]");

        System.out.println(itr.contains(10000));
        System.out.println(itr.size());
        System.out.println(itr+" ");
        Collections.sort(itr);
//        int originalSize = itr.size();
//        for (int i =  originalSize-1; i >= 0 ; i--) {
//
//            itr.add(itr.get(i));
//        }
        System.out.println(itr+" ");

        Collections.reverse(itr);
        System.out.println(itr);


        ArrayList<Integer> newList = (ArrayList<Integer>) itr.clone();

        System.out.println(newList);
        ArrayDeque<Integer> arrDq= new ArrayDeque<>();

        arrDq.push(59);
        arrDq.push(78);
        arrDq.push(55);
        arrDq.push(38);
        arrDq.push(21);

        System.out.println(arrDq);
        arrDq.pop();
        arrDq.pop();
        arrDq.addFirst(59);
        arrDq.addLast(70);
        System.out.println(arrDq);

        Stack<Integer>st = new Stack<>();
        st.push(45);
        st.push(42);
        st.push(47);
        st.push(49);
        System.out.println(st);
        st.addFirst(4);
        st.addLast(4);
        System.out.println(st);
        st.set(2,64);

        System.out.println(st);




    }
}
