import java.util.Comparator;

public interface MyList<T> {
    boolean add(T element);

    void sort(Comparator<? super T> comparator);

    void add(int index, T element);

    T get(int index);

    T set(int index, T element);

    void remove(int index);

    void remove(T element);

    int size();

    interface MyLinkedList<T> {

    Integer size();

    void addLast(T t );

    void addFirst(T t );

    T remove (T t);

    void sort();
    T getElementByIndex(int counter);
    }
}