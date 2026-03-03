import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        // The below code makes the linked list behave like a stack
        // list.push("A");
        // list.push("B");
        // list.push("C");
        // list.push("D");
        // list.push("F");
        // list.pop();

        // The below code makes the linked list behave like a queue
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");
        // list.poll();

        list.add(4, "E"); // Adding "E" at index 4
        list.remove("E"); // Removing "E" from the list

        System.out.println(list.peekFirst()); // Peek first element o/p: A
        System.out.println(list.peekLast());  // Peek last element o/p: F

        list.addFirst("0"); // Adding element at the start
        list.addLast("G");  // Adding element at the end
        list.removeFirst(); // Removing element at the start
        list.removeLast();  // Removing element at the end


        System.out.println(list);

        // Using push/pop gives stack behavior (LIFO), and offer/poll gives queue behavior for a LinkedList

        // From List:
        // add(index, element)
        // get(index)
        // set(index, element)
        // remove(index)
        // size()

        // From Queue:
        // offer()
        // poll()
        // peek()

        // From Deque (stack + double-ended):
        // push()
        // pop()
        // addFirst()
        // addLast()
        // removeFirst()
        // removeLast()
        // peekFirst()
        // peekLast()

        // From LinkedList itself:
        // getFirst()
        // getLast()
        // removeFirstOccurrence()
        // removeLastOccurrence()
    }
}