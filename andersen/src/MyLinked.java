import org.w3c.dom.Node;

import java.util.LinkedList;

public class MyLinked<T> implements MyList.MyLinkedList<T> {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
    }

    private Node<T> fstNode;
    private Node<T> lstNode;
    private int size = 0;


    private class Node<T> {
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;


        private Node(T currentElement, Node<T> prevElement, Node<T> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<T> prevElement) {
            this.prevElement = prevElement;
        }
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public void addLast(T t) {
        Node<T> prev = lstNode;
        prev.setCurrentElement(t);
        lstNode = new Node<T>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;

    }

    @Override
    public void addFirst(T t) {

    }

    @Override
    public T getElementByIndex(int counter) {
        return null;
    }

    @Override
    public T remove(T t) {
        return null;
    }

    @Override
    public void sort() {

    }
}
