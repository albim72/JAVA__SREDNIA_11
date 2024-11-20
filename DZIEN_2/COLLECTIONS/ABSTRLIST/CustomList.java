import java.util.AbstractList;

public class CustomList extends AbstractList<Integer> {
    private int[] array; //przechowujemy elementy w tablicy
    private int size; //rozmiar tablicy

    
    public CustomList(int[] array, int size) {
        this.array = array;
        this.size = size;
    }

    //konstruktor inicjujący tablicę o określonej wielkości
    public CustomList(int capacity){
        array = new int[capacity];
        size = 0;
    }


    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Indeks poza zakresem!");
        }
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Integer element) {
        if(size>=array.length){
            throw new IllegalStateException("Lista jest pełna!");
        }
        array[size++]=element;
        return true;
    }

    @Override
    public Integer set(int index, Integer element) {
       if(index<0 || index>=size) {
           throw new IndexOutOfBoundsException("indeks poza rozmiarem tablicy!");
       }
       int odlValue = array[index];
       array[index] = element;
       return odlValue;
    }

    @Override
    public Integer remove(int index) {
        if(index<0 || index>=size) {
            throw new IndexOutOfBoundsException("indeks poza rozmiarem tablicy!");
        }
        int removedValue = array[index];
        System.arraycopy(array,index+1,array,index,size-index-1);
        size--;
        return removedValue;
    }
}
