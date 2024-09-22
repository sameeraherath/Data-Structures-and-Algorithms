package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main (String[] args) {
        
        //Create a queue using a linked list
        Queue<Integer> queue = new LinkedList<>();

        //Enqueue (add elements to the queue)
        System.out.println("Enqueue Operations:");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);   
        System.out.println(queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue Front: " + queue.peek());
        System.out.println("Removed Element: " + queue.remove());
        System.out.println(queue);
        System.out.println("Peek " + queue.peek()); 
        System.out.println("isEmpty: " + queue.isEmpty());
        

    }
}