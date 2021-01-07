package DataStructures.BinaryTree;

public class Main {

    public static void main(String[] args) {
        RecursiveBinaryTree tree = new RecursiveBinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(-1);
        tree.insert(-3);
        tree.displayTree();
    }
}
