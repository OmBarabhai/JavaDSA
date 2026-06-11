package Basics_Java.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);

        q.offer(40);
        q.offer(50);
        q.offer(60);
        System.out.println(q);

        q.poll();
        q.poll();
        q.poll();
        System.out.println(q);

        System.out.println(q.peek());
        Deque<Integer> Dq = new LinkedList<>();
        Dq.addAll(q);
        System.out.println(Dq);
        System.out.println(Dq.getFirst());
        Dq.offer(70);
        Dq.addFirst(30);
        Dq.addLast(80);
        System.out.println("addFirst&Last: " + Dq);

        Dq.offerFirst(20);
        Dq.offerLast(90);
        System.out.println("offerFirst&Last: " + Dq);


        Dq.removeFirst();
        Dq.removeLast();
        System.out.println("RemoveFirst&last: " + Dq);
        Dq.pollFirst();
        Dq.pollLast();
        System.out.println("PollFirst&Last: " + Dq);


    }
}