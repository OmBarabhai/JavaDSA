package Basics_Java.Collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /// offer it provide false instead of exception in code when queue is not work
        pq.offer(40);
        pq.offer(50);

        /// default behaviour is --> Integer --> less Value --> high priority (MinHeap)
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        maxHeap.addAll(pq);
        maxHeap.offer(20);
        maxHeap.offer(300);
        maxHeap.offer(150);
        maxHeap.offer(2);

        System.out.println(maxHeap);
        maxHeap.poll();
        System.out.println(maxHeap);
        maxHeap.poll();
        System.out.println(maxHeap);


    }
}
