package assignment02;

public class QueueTester {

    public static void main(String[] args) {
        testArrayListQueue1();
        testArrayListQueue2();
    }

    // Testing ArrayListQueue1 (Object Adapter)
    public static void testArrayListQueue1() {
        System.out.println("Testing ArrayListQueue1 (Object Adapter):");
        Queue<Integer> queue1 = new ArrayListQueue1<>();

        // Test for empty queue
        System.out.println("Is empty: " + queue1.isEmpty()); // Expected: true

        // Try to dequeue from empty queue
        try {
            queue1.dequeue();
        } catch (Exception e) {
            System.out.println("Exception occurred during dequeue from empty queue: " + e.getMessage());
        }

        // Try to enqueue a null value
        try {
            queue1.enqueue(null);
        } catch (Exception e) {
            System.out.println("Exception occurred during enqueue of null value: " + e.getMessage());
        }

        // Enqueue elements
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        System.out.println("Is empty after enqueuing: " + queue1.isEmpty()); // Expected: false

        // Dequeue an element
        System.out.println("Dequeued: " + queue1.dequeue()); // Expected: 10

        // Remove a specific element
        System.out.println("Remove 20: " + queue1.removeQueue(20)); // Expected: true
        System.out.println("Remove 40 (non-existent): " + queue1.removeQueue(40)); // Expected: false

        // Dequeue remaining elements
        System.out.println("Dequeued: " + queue1.dequeue()); // Expected: 30

        // Test for empty queue again
        System.out.println("Is empty after all dequeues: " + queue1.isEmpty()); // Expected: true

        System.out.println();
    }

    // Testing ArrayListQueue2 (Class Adapter)
    public static void testArrayListQueue2() {
        System.out.println("Testing ArrayListQueue2 (Class Adapter):");
        Queue<Integer> queue2 = new ArrayListQueue2<>();

        // Test for empty queue
        System.out.println("Is empty: " + queue2.isEmpty()); // Expected: true

        // Try to dequeue from empty queue
        try {
            queue2.dequeue();
        } catch (Exception e) {
            System.out.println("Exception occurred during dequeue from empty queue: " + e.getMessage());
        }

        // Try to enqueue a null value
        try {
            queue2.enqueue(null);
        } catch (Exception e) {
            System.out.println("Exception occurred during enqueue of null value: " + e.getMessage());
        }

        // Enqueue elements
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        System.out.println("Is empty after enqueuing: " + queue2.isEmpty()); // Expected: false

        // Dequeue an element
        System.out.println("Dequeued: " + queue2.dequeue()); // Expected: 10

        // Remove a specific element
        System.out.println("Remove 20: " + queue2.removeQueue(20)); // Expected: true
        System.out.println("Remove 40 (non-existent): " + queue2.removeQueue(40)); // Expected: false

        // Dequeue remaining elements
        System.out.println("Dequeued: " + queue2.dequeue()); // Expected: 30

        // Test for empty queue again
        System.out.println("Is empty after all dequeues: " + queue2.isEmpty()); // Expected: true
    }
}
