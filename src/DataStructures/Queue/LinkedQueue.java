package DataStructures.Queue;

import DataStructures.LinkedList.LinkedList;

public class LinkedQueue<T> {
    private static class Node<T>{
        T element;
        private Node<T> next;
        private Node<T> prev;


        public Node(T element){
            this.element = element;
            next = null;
            prev = null;
        }

        @Override
        public String toString() {
            return element.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return this.equals(obj);
        }
    }

    private Node<T> front;
    private Node<T> rear;

    public int getSize() {
        return size;
    }

    private int size;

    public LinkedQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T element){
        Node<T> node = new Node<>(element);
        if (front == null && rear == null){
            front = rear = node;
            size++;
        }else {
            rear.next = node;
            rear = node;
            size++;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) return null;
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = front;
        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }

        return sb.toString();
    }
}
