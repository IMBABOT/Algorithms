package DataStructures.BinaryTree;

public class RecursiveBinaryTree {

    private static class Node {
        private int element;
        private Node left;
        private Node right;
        private Node parent;

        private Node(int element) {
            this.element = element;
        }
    }

    private Node root;


    public RecursiveBinaryTree() {
        root = null;
    }

    public void insert(int element) {
        root = insertNode(root, new Node(element));
    }

    private Node insertNode(Node currentparent, Node node) {
        if (currentparent == null) {
            return node;
        } else if (node.element > currentparent.element) {
            Node lchild = insertNode(currentparent.left, node);
            node.left = lchild;

            lchild.parent = node;
        } else if (node.element < currentparent.element) {
            Node rchild = insertNode(currentparent.right, node);
            node.right = rchild;

            rchild.parent = node;
        }
        return currentparent;
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






