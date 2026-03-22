/*
    It uses a Heap (Binary Heap) internally

    Think like this:

    Elements are arranged in a tree structure   
    The top of the heap always stores:
    smallest element (default)
    OR largest (if max heap)
*/

import java.util.*;
public class Pqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);     // insert (same as add)
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(10);      // insert duplicate element allowed
      
        System.out.println(pq.peek());       // get top element (smallest)
        pq.poll();       // remove top element

        System.out.println(pq.isEmpty());    // check empty
        System.out.println(pq.size())       ;       // size

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }
    }
}