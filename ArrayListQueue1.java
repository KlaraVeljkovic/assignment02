package assignment02;

import java.util.ArrayList;

public class ArrayListQueue1<E> implements Queue<E> {
    private ArrayList<E> list = new ArrayList<>();  // Use ArrayList internally

    // Adds an element to the end of the queue (enqueue operation)
    @Override
    public void enqueue(E e) {
        list.add(e);  // Add element to the end of the list
    }

    // Removes and returns the element from the front of the queue (dequeue operation)
    @Override
    public E dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.remove(0);  // Remove the first element (index 0)
    }

    // Removes the first occurrence of the specified element from the queue
    @Override
    public boolean removeQueue(E e) {
        return list.remove(e);  // Use ArrayList's remove method
    }

    // Returns the element at the front of the queue without removing it
    @Override
    public E peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);  // Get the first element (index 0)
    }

    // Checks if the queue is empty
    @Override
    public boolean isEmpty() {
        return list.isEmpty();  // Check if the list is empty
    }
}
