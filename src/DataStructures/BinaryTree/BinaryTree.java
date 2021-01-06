package DataStructures.BinaryTree;

public class BinaryTree<T> {

    private static class Node<T>{
        T element;
        Node<T> left;
        Node<T> right;

        public Node(T element){
            this.element = element;
            left = null;
            right = null;
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
            return this.equals(node);
        }
    }
}
