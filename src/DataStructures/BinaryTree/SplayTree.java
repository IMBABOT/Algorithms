package DataStructures.BinaryTree;

public class SplayTree {

    private static class Node {
        int element;
        Node left;
        Node right;
        Node parent;


        public Node(int element) {
            this.element = element;
            left = null;
            right = null;
            parent = null;
        }
    }

    private Node root;

    public SplayTree() {
        root = null;
    }




    public void insert(int element){
        Node node = new Node(element);
        if (root == null){
            root = node;
        }else {
            Node current = root;
            Node temp;
            while (true){
                temp = current;
                if (element > current.element){
                    current = current.right;
                    if (current == null){
                        temp.right = node;
                        node.parent = node;
                        return;
                    }
                }
                if (element < current.element){
                    current = current.left;
                    if (current == null){
                        temp.left = node;
                        node.parent = node;
                        return;
                    }
                }
            }
        }
    }

    private void splay(){

    }


    public void preOrder() {
        traversalPreOrder(root);
    }

    public void inOrder() {
        traversalInOrder(root);
    }

    public void postOrder() {
        traversalPostOrder(root);
    }


    private void traversalPreOrder(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.element);
            traversalInOrder(node.left);
            traversalInOrder(node.right);
        }
    }

    private void traversalInOrder(Node node) {
        if (node == null) {
            return;
        } else {
            traversalInOrder(node.left);
            System.out.println(node.element);
            traversalInOrder(node.right);
        }
    }


    private void traversalPostOrder(Node node) {
        if (node == null) {
            return;
        } else {
            traversalInOrder(node.left);
            traversalInOrder(node.right);
            System.out.println(node.element);
        }
    }
}

