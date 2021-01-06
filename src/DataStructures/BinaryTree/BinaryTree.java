package DataStructures.BinaryTree;

public class BinaryTree {

    private static class Node {
        int element;
        Node left;
        Node right;

        int rcount;
        int lcount;

        public Node(int element) {
            this.element = element;
            left = null;
            right = null;
            rcount = 0;
            lcount = 0;
        }


        private Node root;


        public int find(int element) {
            int temp = 0;
            Node current = (Node) root;
            while (current.element != element) {
                if (current.element < element) {
                    current = current.left;
                }else if (current.element > element){
                    current = current.right;
                }
                if (current == null){
                    throw new RuntimeException("no such element: " + element);
                }
            }
            temp = current.element;

            return temp;
        }

        public void insert(int element){
            Node node = new Node(element);
            if (root == null){
                root = node;
            }else {
                Node current = root;
                Node previous;
                while (true){
                    previous = current;
                    if (element < current.element){
                        current = current.left;
                        if (current == null){
                            previous.left = node;
                            return;
                        }
                    }else if (element > current.element){
                        current = current.right;
                        if (current == null){
                            previous.right = node;
                            return;
                        }
                    }
                }
            }
        }

        public void displayTree(){
            inOrderTravers(root);
        }

        private void inOrderTravers(Node current){
            inOrderTravers(current.left);
            System.out.println(root);
            inOrderTravers(current.right);
        }
    }
}