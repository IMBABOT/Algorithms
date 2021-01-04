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
            return this.equals(node);
        }
    }


    private int size;
    private Node last;
    private Node current;


    public CircularLinkedList() {
        this.size = 0;
        this.last = null;
        this.current = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAtBegin(T t) {
        Node<T> node = new Node<>(t);
        if (current == null) {
            current = node;
            last = node;
            node.next = node;
            size++;
        } else {
            last.next = node;
            node.next = current;
            current = node;
            size++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (last != null) {
            Node current = last;
            do {
                sb.append(current.element);
                current = current.next;
                if (current != last && current != null) {
                    sb.append(", ");
                }
            } while (current != last && current != null);
        }
        sb.append(",");
        String temp = sb.toString();
        String[]arr = temp.split(",");
        String s = arr[0];
        String[]shift = new String[arr.length];
        System.arraycopy(arr, 1, shift, 0, arr.length-1);
        shift[shift.length - 1] = s;
        String[]farr = new String[shift.length];
        for (int i = 0; i <shift.length ; i++) {
            farr[i] = shift[i].trim();
        }
        String finalstr = Arrays.toString(farr);
        return finalstr;
    }
}
