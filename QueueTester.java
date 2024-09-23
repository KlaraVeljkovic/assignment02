package assignment02;
public class QueueTester 
{
    public static void main(String[] args) 
    {
        test1();
        test2();
    }
    // Tests ArrayListQueue1
    public static void test1() 
    {
        System.out.println("Testing ArrayListQueue1:");
        Queue<Integer> queue1 = new ArrayListQueue1<>();
        // Tests for an empty queue
        System.out.println("Is empty: " + queue1.isEmpty()); // true
        try 
        {
            queue1.dequeue();
        } 
        catch (Exception e) 
        {
            System.out.println("An exception occurred for dequeue from empty queue: " + e.getMessage());
        }
        try 
        {
            queue1.enqueue(null);
        } 
        catch (Exception e) 
        {
            System.out.println("An exception occurred for enqueue of null value: " + e.getMessage());
        }
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        System.out.println("Is empty after enqueuing: " + queue1.isEmpty()); // false
        System.out.println("Dequeued: " + queue1.dequeue()); // 10 should be output
        System.out.println("Remove 20: " + queue1.removeQueue(20)); // true
        System.out.println("Remove 40 (non-existent): " + queue1.removeQueue(40)); // false
        System.out.println("Dequeued: " + queue1.dequeue()); // 30
        System.out.println("Is empty after all dequeues: " + queue1.isEmpty()); // true
        System.out.println();
    }

    // Tests ArrayListQueue2
    public static void test2() 
    {
        System.out.println("Testing ArrayListQueue2:");
        Queue<Integer> queue2 = new ArrayListQueue2<>();
        // Test for empty queue
        System.out.println("Is empty: " + queue2.isEmpty()); // true
        try 
        {
            queue2.dequeue();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception occurred on dequeue from empty queue: " + e.getMessage());
        }
        try 
        {
            queue2.enqueue(null);
        } 
        catch (Exception e) 
        {
            System.out.println("Exception occurred on enqueue of null value: " + e.getMessage());
        }
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        System.out.println("Is empty after enqueuing: " + queue2.isEmpty()); // false
        System.out.println("Dequeued: " + queue2.dequeue()); // 10
        System.out.println("Remove 20: " + queue2.removeQueue(20)); // true
        System.out.println("Remove 40 (non-existent): " + queue2.removeQueue(40)); // false
        System.out.println("Dequeued: " + queue2.dequeue()); // 30
        System.out.println("Is empty after all dequeues: " + queue2.isEmpty()); // true
    }
}
