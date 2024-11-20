import java.util.EmptyStackException;

public class MyStack<T> {
    private Object[] stackArray;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    
    public MyStack(){
        stackArray = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    
    public void push(T element){
        if(size == stackArray.length){
            resize();
        }
        stackArray[size++] = element;
    }
    
    //usunięcie elementu ze stosu
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T element = (T) stackArray[--size];
        stackArray[size] = null; //usunięcie referencji do obiektu
        return element;
    }
    
    //zwrócenie elementu na szczycie stosu(peek)
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return (T) stackArray[size-1];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    
    
    //rozszerzenie tablicy w wypadku gdy stos jest pełny
    private void resize(){
        int newCapacity = stackArray.length*2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(stackArray,0,newArray,0,stackArray.length);
        stackArray = newArray;
    }
    
}
