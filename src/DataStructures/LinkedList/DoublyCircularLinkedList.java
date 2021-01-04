package DataStructures.LinkedList;

import java.util.Arrays;

public class DoublyCircularLinkedList<T> {

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

    private int size;
    private Node head;
    public  Node tail;

    public int getSize() {
        return size;
    }

    public DoublyCircularLinkedList(){
        this.size = 0;
        head = null;
        tail = null;
    }

    public void insertAtBegin(T element){

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




