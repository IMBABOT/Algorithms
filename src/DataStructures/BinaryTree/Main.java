package DataStructures.BinaryTree;

public class Main {

    public static void main(String[] args) {
        RecursiveBinaryTree rbt = new RecursiveBinaryTree();
        rbt.insert(1);
        rbt.insert(2);
        rbt.insert(3);
        rbt.insert(4);

        System.out.println(rbt);

        rbt.inOrder();
        rbt.postOrder();



    }
}
