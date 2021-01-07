package DataStructures.BinaryTree;

public class Main {

    public static void main(String[] args) {
        RecursiveBinaryTree tree = new RecursiveBinaryTree();
        tree.insert(4);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        tree.insert(10);
        tree.insert(1);



        tree.postOrder();
    }
}
