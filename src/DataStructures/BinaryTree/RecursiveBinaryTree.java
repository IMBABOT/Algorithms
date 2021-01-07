package DataStructures.BinaryTree;

public class RecursiveBinaryTree {

    private static class Node{
        public int element;
        public Node left;
        public Node right;
        public Node(int element){
            this.element = element;
        }
    }

    private Node root;

    public RecursiveBinaryTree(){
        root = null;
    }

    public void insert(int element){
        root = insertNode(root, new Node(element));
    }

    private Node insertNode(Node currentparent, Node node) {
        if (currentparent == null) {
            return node;
        }else if (node.element > currentparent.element) {
             currentparent.left = insertNode(currentparent.left, node);
        }else if (node.element < currentparent.element) {
             currentparent.right = insertNode(currentparent.right, node);
        }
        return currentparent;
    }



    public void inOrderDisplay(){
        traversalLeft(root.left);
        System.out.println(root.element);
        traversalRight(root.right);
    }

    private void traversalLeft(Node node) {
        if (node != null) {
            System.out.println(node.element);
            traversalLeft(node.left);
        }
    }
    private void traversalRight(Node node){
        if (node != null){
            System.out.println(node.element);
            traversalRight(node.right);
        }
    }

    public void displayPreorder(){
        System.out.println(root.element);
        traversalLeft(root.left);
        traversalRight(root.right);
    }

    public void displayPostorder(){
        traversalLeft(root.left);
        traversalRight(root.right);
        System.out.println(root.element);
    }

}


