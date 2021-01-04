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
        StringBuilder sb = new StringBuilder() = "";
        if (last != null) {
            Node current = last;
            do {
                str = str + current.element;
                current = current.next;
                if (current != last && current != null) {
                    str = str + ", ";
                }
            } while (current != last && current != null);
        }


        String[] arr = str.split(",");
        String s = arr[0];
        String[] res = new String[arr.length];
        System.arraycopy(arr, 1, res, 0, arr.length-1);
        res[res.length - 1] = s;
        String result = "";
        System.out.println(Arrays.toString(res));
        return str;
    }
}
