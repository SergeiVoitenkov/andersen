import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> implements MyList<T> {
    private int size;
    private T[] elementArray;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elementArray = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elementArray = (T[]) new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    @Override
    public boolean add(T e) {
        if (size == elementArray.length) {
            elementArray = increaseArray(size);
        }

        elementArray[size] = (T) e;
        size++;
        return true;

    }

    @Override
    public void sort(Comparator<? super T> comparator) {

        for (int i = 0; i < size; i++) {

            for (int j = 0, k = 1; j < size && k < size; j++, k++) {

                if (comparator.compare(elementArray[j], elementArray[k]) > 0) {
                    T tmp = elementArray[j];
                    elementArray[j] = elementArray[k];
                    elementArray[k] = tmp;
                }
            }
        }
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public int size() {
        return 0;
    }

    private T[] increaseArray(int size) {
        return Arrays.copyOf(elementArray, (int) (size * 1.5) + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                sb.append(elementArray[i]).append(", ");
            } else {
                sb.append(elementArray[i]);
            }
        }
        return sb.toString();
    }
}