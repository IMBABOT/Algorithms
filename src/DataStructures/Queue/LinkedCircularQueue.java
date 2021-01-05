package DataStructures.Queue;


import java.util.Arrays;

public class LinkedCircularQueue<T> {
    public static class Node<T>{
        T element;
        Node<T> next;
        Node<T> prev;


        public Node(T element){
            this.element = element;
            next = null;
            prev = null;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return this.equals(node);
        }

        @Override
        public String toString() {
           return element.toString();
        }
    }


    private int size;
    private Node<T> front;
    private Node<T> rear;

    public LinkedCircularQueue(){
        size = 0;
        front = null;
        rear = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int element) {
        Node node = new Node<>(element);
        if (rear == null){
            rear = front = node;
            rear.next = front;
            size++;
        }else {
            rear.next = node;
            rear = node;
            rear.next = front;
            size++;
        }
    }

    public T dequeue(){
        Node temp = front;
        if (front == null && rear == null) {
            throw new RuntimeException("Queue is empty");
        }else if (front == rear){
            temp = front;
            front = rear = null;
            size--;
        }else {
            front = front.next;
            rear.next = front;
            size--;
        }

        return (T) temp;
    }

    public T peek(){
        Node temp = front;
        if (front == null && rear == null) {
            throw new RuntimeException("Queue is empty");
        }else {
            temp = front;
        }

        return (T) temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String finalstr = "";
        if (rear != null) {
            Node current = rear;
            do {
                sb.append(current.element);
                current = current.next;
                if (current != rear && current != null) {
                    sb.append(", ");
                }
            } while (current != rear && current != null);
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



