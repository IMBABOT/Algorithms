package DataStructures.LinkedList;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.isert(1);
        circularLinkedList.isert(2);
        circularLinkedList.isert(3);
        circularLinkedList.isert(4);



        System.out.println(circularLinkedList.getSize());

        System.out.println(circularLinkedList);



    }
}
