package DataStructures.LinkedList;

public class DoublyLinkedList<E> {

    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;


        public Node(E element, Node<E> next, Node<E> prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
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
            return node.equals(obj);
        }
    }

    int size;
    Node<E> first;
    Node<E> last;

    public DoublyLinkedList(){
        size = 0;

    }

    public void insertInBegin(E element){
        Node<E> temp = first;
        Node<E> newNode = new Node<>(element, first, null);
        first = newNode;
        if (first == null)
            last = newNode;
        else
            first.prev = newNode;
        size++;
    }



    public boolean isEmpty(){
        return size == 0;
    }


    @Override
    public String toString() {
        if (isEmpty()) return null;
        Node<E> current = first;
        StringBuilder sb = new StringBuilder("[");

        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }

        return sb.toString();
    }
}