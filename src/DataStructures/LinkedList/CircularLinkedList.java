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
    private Node tail;


    public CircularLinkedList() {
        this.size = 0;
        this.tail = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAtBegin(T t) {
       Node<T> node = new Node<>(t);
        if (tail == null){
            tail = node;
            tail.next = node;
            size++;
        }else{
            node.next = tail.next;
            tail.next = node;
            size++;
        }
    }

    public void insertAtEnd(T t){
        Node<T> node = new Node<>(t);
        if (tail == null) {
            tail = node;
            tail.next = node;
            size++;
        }else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insertAtPosition(int position, T t){
        Node<T> node = new Node<>(t);
        Node<T> temp = tail.next;
        int i = 1;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;

        if (size < position){
            throw new RuntimeException("Invalid position: " + position);
        }
        if (position == size){
            insertAtEnd(t);
        }else if (position == 1){
            insertAtBegin(t);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (tail != null) {
            Node current = tail;
            do {
                sb.append(current.element);
                current = current.next;
                if (current != tail && current != null) {
                    sb.append(", ");
                }
            } while (current != tail && current != null);
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
