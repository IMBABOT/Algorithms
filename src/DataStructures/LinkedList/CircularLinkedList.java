package DataStructures.LinkedList;


import java.util.Arrays;

public class CircularLinkedList<T> {

    public static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return element.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node<T> node = (Node) obj;
            return (node.equals(obj));
        }
    }

    private int size;
    private Node first;

    public CircularLinkedList(){
        this.size = 0;
        first = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void isert(T t) {
        Node<T> node = new Node<>(t);
        Node<T> temp = first;
        if (first == null) {
            first = temp = node;
            size++;
        } else {
            temp.next = node;
            temp = node;
            size++;
        }
        temp.next = first;

    }




    @Override
    public String toString() {
        if (isEmpty()) return null;
        Node<T> current = first;
        StringBuilder sb = new StringBuilder("[");

        while (current.next != first){
            System.out.println(first.next);
        }



        return sb.toString();
    }
}
