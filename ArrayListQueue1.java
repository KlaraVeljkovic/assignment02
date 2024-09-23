package assignment02;
import java.util.ArrayList;

public class ArrayListQueue1<E> implements Queue<E> {
    private ArrayList<E> arrayList = new ArrayList<>();

    @Override
    public void enqueue(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Cannot enqueue null element.");
        }
        arrayList.add(e); // Use add method to add at the end
    }

    @Override
    public E dequeue() {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }
        return arrayList.remove(0); // Remove and return the first element
    }

    @Override
    public boolean removeQueue(E e) {
        int index = arrayList.indexOf(e); // Find the first occurrence of e
        if (index != -1) {
            arrayList.remove(index); // Remove the element if found
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty(); // Check if the queue is empty
    }
}
