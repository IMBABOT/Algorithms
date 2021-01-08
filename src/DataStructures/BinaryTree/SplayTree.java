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

    public int getSize() {
        return size;
    }

    private int size;

    public SplayTree() {
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
            currentparent.left = lchild;

            lchild.parent = currentparent;
        } else if (node.element < currentparent.element) {
            Node rchild = insertNode(currentparent.right, node);
            currentparent.right = rchild;

            rchild.parent = currentparent;
        }
        splay(currentparent);
        return currentparent;
    }

    private void splay(Node node) {
        while (node.parent != null) {
            if (node.parent == root) {
                if (node == node.parent.left) {
                    rightRotation(node.parent);
                } else {
                    leftRotation(node.parent);
                }
            } else {
                Node p = node.parent;
                Node g = p.parent;
                if (node == node.parent.left && p == p.parent.left) {
                    rightRotation(g);
                    rightRotation(p);
                } else if (node == node.parent.right && p == p.parent.right) {
                    leftRotation(g);
                    leftRotation(p);
                } else if (node == node.parent.left && p == p.parent.right) {
                    rightRotation(p);
                    leftRotation(g);
                } else {
                    leftRotation(p);
                    rightRotation(g);
                }
            }
        }
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


    private Node leftRotation(Node node) {
        Node y = node.right;
        node.right = y.left;
        y.left = node;
        return y;
    }


    private Node rightRotation(Node node) {
        Node y = node.left;
        node.left = y.right;
        y.right = node;
        return y;
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



