package DataStructures.LinkedList;

import java.util.Map;

public class LinkedList<T> {
    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element){
            this.element = element;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return  (node.equals(obj));
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }


    private Node head;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(T t){
        Node<T> node = new Node<>(t);
        node.next = head;
        head = node;
    }

    public T remove(){
        if (isEmpty()) return null;
        Node<T> remove = head;
        head = head.next;
        return (T) remove;
    }

    @Override
    public String toString() {
        if (isEmpty()) return null;
        Node<T> current = head;
        StringBuilder sb = new StringBuilder("[");
        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }

        return sb.toString();
    }
}
