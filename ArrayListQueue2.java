package assignment02;
import java.util.ArrayList;

public class ArrayListQueue2<E> extends ArrayList<E> implements Queue<E> {

    @Override
    public void enqueue(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Cannot enqueue null element.");
        }
        add(e); // Use add method of ArrayList to add at the end
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }
        return remove(0); // Remove and return the first element
    }

    @Override
    public boolean removeQueue(E e) {
        int index = indexOf(e); // Find the first occurrence of e
        if (index != -1) {
            remove(index); // Remove the element if found
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty(); // Use ArrayList's isEmpty() method
    }
}
