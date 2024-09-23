package assignment02;
import java.util.ArrayList;

public class ArrayListQueue1<E> implements Queue<E> 
{
    private ArrayList<E> arrayList = new ArrayList<>();
    @Override
    public void enqueue(E e) 
    {
        if (e == null) 
        {
            throw new IllegalArgumentException("Cannot enqueue null element.");
        }
        // adds at the end
        arrayList.add(e);
    }
    @Override
    public E dequeue() 
    {
        if (arrayList.isEmpty()) 
        {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }
        // removes and returns first element
        return arrayList.remove(0); 
    }
    @Override
    public boolean removeQueue(E e) 
    {
        // first occurrence of e
        int index = arrayList.indexOf(e); 
        if (index != -1) 
        {
             // removes element if found
            arrayList.remove(index);
            return true;
        }
        return false;
    }
    @Override
    public boolean isEmpty() 
    {
        return arrayList.isEmpty(); 
    }
}
