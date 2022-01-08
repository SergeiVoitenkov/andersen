import java.util.Comparator;

public interface MyList<T> {
    boolean add(T element);

    void sort(Comparator<? super T> comparator);

    boolean add(int index, T element);

    T get(int index);

    T set(int index, T element);

    String remove(int index);

    void remove(T element);

    int size();

    boolean isEmpty();
}
