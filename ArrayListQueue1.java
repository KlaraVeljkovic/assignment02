package assignment02;
import java.util.ArrayList;

public class ArrayListQueue1<E> implements Queue<E> 
{
    private ArrayList<E> list = new ArrayList<>();  
    // Adds an element to the end of the queue
    @Override
    public void enqueue(E e) 
    {
        list.add(e);
    }
    // Removes the element from the front of the queue then returns
    @Override
    public E dequeue() 
    {
        if (list.isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        return list.remove(0);
    }
    // Removes the first time when that element is in the queue 
    @Override
    public boolean removeQueue(E e) 
    {
        return list.remove(e); 
    }
    // Returns the element at the front of the queue and doesn't remove
    @Override
    public E peek() 
    {
        if (list.isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0); 
    }
    // Checks if queue is empty
    @Override
    public boolean isEmpty() 
    {
        return list.isEmpty();  
    }
}
