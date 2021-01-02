package DataStructures.LinkedList;

public class DoublyLinkedList<E> {

    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;


        public Node(E element){
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

    public void insertInEnd(E element){
       Node<E> node = new Node<>(element);
        if (first == null){
           first = last = node;
       }else {
            last.next = node;
            node.prev = last;
            last = node;
            size++;
        }
    }

    public void insertInBegin(E element){
        Node<E> node = new Node<>(element);
        if (first == null){
            first = last = node;
        }else {
            first.prev = node;
            node.next = first;
            first = node;
            size++;
        }
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