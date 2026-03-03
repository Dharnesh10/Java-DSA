import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        // add - enqueue, offer()
        // remove - dequeue, poll()
        // peek - front element
        // there is a head and tail of the queue, head is where we remove from, tail is where we add to

        // Queue is an interface so it can only be implemented by linkedlist or priority queue
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Bob");
        queue.offer("Alice");
        queue.offer("John");

        System.out.println(queue); // [Karen, Bob, Alice, John]
        System.out.println(queue.peek()); // Karen

        queue.poll(); // removes Karen
        System.out.println(queue); // [Bob, Alice, John]

        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size()); // 3
        System.out.println(queue.contains("Alice")); // true

        // uses of queues?
        // 1. Keyboard Buffering
        // 2. Printer Queue (print jobs waiting to be printed)
        // 3. used in priority queues, linked lists, breadth first search
    }
}