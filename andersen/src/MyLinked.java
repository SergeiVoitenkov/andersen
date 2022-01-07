import org.w3c.dom.Node;

import java.util.LinkedList;

public class MyLinked<T> implements MyList.MyLinkedList<T> {

    private class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public Integer size() {
        Node<T> p;
        int size = 0;
        for (p = head; p != null; p = p.next) {
            size++;
        }
        return size;
    }

    private Node<T> head = null;

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(T t) {
        if (isEmpty()) {
            head = new Node<T>(t);
        } else {
            Node<T> p = head;
            Node<T> node = new Node<T>(t);
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
            node.next = null;
        }

    }

    @Override
    public T remove(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        }
        Node<T> p = head, p1 = null;
        int i = -1;
        while (p != null) {
            i++;
            if (i == index) {
                if (p1 == null) {
                    head = head.next;
                } else {
                    p1.next = p.next;
                }
                return p.value;
            }
            p1 = p;
            p = p.next;
        }
        return null;

    }

    @Override
    public void sort() {

    }

    @Override
    public String toString() {
        return "MyLinked{" +
                "head=" + head +
                '}';
    }
}
