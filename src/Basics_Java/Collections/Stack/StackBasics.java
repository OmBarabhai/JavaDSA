package Basics_Java.Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasics {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        /// as a stack lifo 30 20
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        /// as a stack behave Queue using Offer fifo 10 30 20 40 50
        stack.offerFirst(10);
        stack.offerLast(40);
        stack.offer(50);
        System.out.println("Queue fifo : "+stack);

        System.out.println(stack.peek());


    }
}
