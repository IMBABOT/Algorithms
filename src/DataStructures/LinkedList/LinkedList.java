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

    public int getSize() {
        return size;
    }

    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }



    public boolean isEmpty(){
        return head == null;
    }

    public void insertInHead(T t){
        Node<T> node = new Node<>(t);
        node.next = head;
        head = node;
        size++;
    }


    public void insertInSpecific(int index, T t){
        Node<T> node = new Node<>(t);
        Node<T> current = head;
        int i = 0;
        if (index > size){
            throw new RuntimeException("Invalid index: " + index);
        }else {
            while (i < index){
                current = current.next;
                i++;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void insertInTail(T t) {
        Node<T> node = new Node<>(t);
        if (head == null){
            head = node;
            size++;
        }else if (head !=null) {

            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            size++;
        }
    }

    public T deleteFromTail(){
        Node<T> current = head;
        Node<T> prevnode =  new Node<>(null);
        Node<T> delete = new Node<>(null);
        while (current.next != null){
            prevnode = current;
            current = current.next;
        }
        if(current == head){
            delete = head;
            head = null;
            size--;
        }else {
            prevnode.next = null;
            delete = current;
            size--;
        }
        return (T) delete;
    }

//    public T removeFromPosition(int pos){
//
//    }

    public T remove(){
        if (isEmpty()) return null;
        Node<T> remove = head;
        head = head.next;
        size--;
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
