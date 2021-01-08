package DataStructures.BinaryTree;

public class Main {

    public static void main(String[] args) {
        SplayTree splayTree = new SplayTree();
        splayTree.insert(1);
        splayTree.insert(8);
        splayTree.insert(10);
        splayTree.insert(13);
        splayTree.insert(7);
        splayTree.insert(6);
        splayTree.insert(3);
        splayTree.insert(2);
        splayTree.insert(3);

        splayTree.inOrder();

    }
}
