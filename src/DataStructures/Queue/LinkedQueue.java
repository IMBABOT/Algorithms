package DataStructures.Queue;



public class LinkedQueue<T> {
    private static class Node<T>{
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
}
