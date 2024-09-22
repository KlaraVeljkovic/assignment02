package assignment02;

public class QueueTester {

    public static void main(String[] args) {
        // Test with ArrayListQueue1
        System.out.println("Testing ArrayListQueue1...");
        testQueue(new ArrayListQueue1<>());

        // Test with ArrayListQueue2
        System.out.println("\nTesting ArrayListQueue2...");
        testQueue(new ArrayListQueue2<>());
    }

    public static void testQueue(Queue<Integer> queue) {
        // Test for empty queue
        System.out.println("Testing empty queue...");

        try {
            System.out.println("Attempting to peek on empty queue...");
            queue.peek();  // Should throw an exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            System.out.println("Attempting to dequeue on empty queue...");
            queue.dequeue();  // Should throw an exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Queue is empty: " + queue.isEmpty());  // Should return true

        // Test enqueue
        System.out.println("Adding elements to the queue...");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue is empty: " + queue.isEmpty());  // Should return false
        System.out.println("Front element after enqueue: " + queue.peek());  // Should return 1

        // Test dequeue
        System.out.println("Dequeueing element...");
        Integer dequeuedElement = queue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);  // Should return 1
        System.out.println("Front element after dequeue: " + queue.peek());  // Should return 2

        // Dequeue all elements
        System.out.println("Dequeueing all elements...");
        queue.dequeue();
        queue.dequeue();

        try {
            System.out.println("Attempting to peek on empty queue after dequeueing all...");
            queue.peek();  // Should throw an exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            System.out.println("Attempting to dequeue on empty queue after dequeueing all...");
            queue.dequeue();  // Should throw an exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Queue is empty: " + queue.isEmpty());  // Should return true
    }
}
