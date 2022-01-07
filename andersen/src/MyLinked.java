import org.w3c.dom.Node;

import java.util.LinkedList;

public class MyLinked<T> implements MyList.MyLinkedList<T> {
    /*    private Node<T> fstNode;
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
            Node<T> next = fstNode;
            next.setCurrentElement(t);
            fstNode = new Node<>(null, null, next);
            next.setPrevElement(fstNode);
            size++;

        }

        @Override
        public T getElementByIndex(int counter) {
            Node<T> target = fstNode.getNextElement();
            for (int i = 0; i < counter; i++) {
                target = getNextElement(target);
            }
            return target.getCurrentElement();
        }

        private Node<T> getNextElement(Node<T> current) {
            return current.getNextElement();
        }

        @Override
        public T remove(T t) {
            return null;
        }

        @Override
        public void sort() {

        }
    }*/


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
    public void printLinkList() {
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            System.out.print(p.value + "--->");
        }
        System.out.println();
    }
}
