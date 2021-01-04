package DataStructures.LinkedList;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.insertAtBegin(1);
        circularLinkedList.insertAtBegin(2);
        circularLinkedList.insertAtBegin(3);


        System.out.println(circularLinkedList.getSize());
         System.out.println(circularLinkedList);



    }
}
