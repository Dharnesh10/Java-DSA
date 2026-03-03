import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        // If it is a priority queue it will automatically sort the numbers in ascending order
        /*  o/p:
            1.5
            2.0
            2.5
            3.0
            4.0  */

        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // for sorting nos in descending order
        

    }
}