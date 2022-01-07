import java.util.Comparator;

public interface MyList<T> {
    boolean add(T element);

    void sort(Comparator<? super T> comparator);

    boolean add(int index, T element);

    T get(int index);

    T set(int index, T element);

    void remove(int index);

    void remove(T element);

    int size();

    interface MyLinkedList<T> {

        Integer size();

        void add(T t);

        T remove(int index);

        void sort();
    }
}