package assignment02;
import java.util.ArrayList;
public class ArrayListQueue1<E> implements Queue<E> 
{
 
    // Adds an element to the end of the queue (enqueue operation)
    @Override
    public void enqueue(E e) {
        this.add(e);  // Use inherited ArrayList's add method
    }

    // Removes and returns the element from the front of the queue (dequeue operation)
    @Override
    public E dequeue() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return this.remove(0);  // Remove the first element (index 0)
    }

    // Returns the element at the front of the queue without removing it
    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return this.get(0);  // Get the first element (index 0)
    }

    // Checks if the queue is empty
    @Override
    public boolean isEmpty() {
        return super.isEmpty();  // Use inherited ArrayList's isEmpty method
    }

    // Returns the index of the first occurrence of the specified element, or -1 if not present
    public int indexOf(E e) {
        return super.indexOf(e);  // Use inherited ArrayList's indexOf method
    }

    // Returns the current size of the queue (inherited from ArrayList)
    public int size() {
        return super.size();  // Inherited ArrayList's size method
    }
}