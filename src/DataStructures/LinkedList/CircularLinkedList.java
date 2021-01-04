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
        int i = 1;
        if (position == 1){
            insertAtBegin(t);
        }else if (position == size){
            insertAtEnd(t);
        }else {
            Node<T> temp = tail.next;
            while (i < position) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public T deleteFromBegin(){
        Node<T> temp = tail.next;
        if (size == 0){
            throw new RuntimeException("list is empty: " + size);
        }else if (tail == tail.next){
            tail = null;
        }else {
            tail.next = temp.next;
        }
        size--;
        return (T) temp;
    }

    public T deleteFromEnd(){
        Node<T> current = tail.next;
        Node<T> delete = tail.next;
        if (size == 0){
            throw new RuntimeException("list is empty: " + size);
        }else if (tail.next == tail){
            delete = tail;
            tail = null;
        }else {
            while (current.next != tail.next){
                delete = current;
                current = current.next;
            }
            delete.next = tail.next;
            tail = delete;
        }
        size--;
        return (T) delete;
    }

    public T delFromPos(int position){
        int pos = 0;
        int i = 0;
        int l = size;
        Node<T> current = tail;
        Node<T> next = tail;
        if (position == 1){
            deleteFromBegin();
        }else if (position == size){
            deleteFromEnd();
        }else{
            while (i < position - 1){
                current = current.next;
                i++;
            }
            next = current.next;
            current.next = next.next;
            size--;
        }
        return (T) next;
    }

    public void reverse(){
        Node<T> current = tail.next;
        Node<T> prev = tail.next;
        Node<T> next = current.next;
        while (current != tail){
            prev = current;
            current = next;
            next = current.next;
            current.next = prev;
        }
        next.next = tail;
        tail = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String finalstr = "";
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
        if (temp.length() > 1) {
            String s = arr[0];
            String[] shift = new String[arr.length];
            System.arraycopy(arr, 1, shift, 0, arr.length - 1);
            shift[shift.length - 1] = s;
            String[] farr = new String[shift.length];
            for (int i = 0; i < shift.length; i++) {
                farr[i] = shift[i].trim();
            }
            finalstr = Arrays.toString(farr);
        }
        return finalstr;
    }
}
