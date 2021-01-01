package DataStructures.LinkedList;

public class DoublyLinkedList<E> {

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return (node.equals(obj));
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

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public void insert(E element){
        Node<E> node = new Node<>(element);
        Node<E> temp = head;
        node.prev = null;
        node.next = null;
        if (head == null){
            head = temp = node;
        }else{
            temp.next = node;
            node.prev = temp;
            temp = node;
            size++;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) return null;
        Node<E> current = head;
        StringBuilder sb = new StringBuilder("[");
        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }

        return sb.toString();
    }
}