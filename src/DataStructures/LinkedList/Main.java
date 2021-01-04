package DataStructures.LinkedList;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.insertAtBegin(20);
        circularLinkedList.insertAtBegin(40);
        circularLinkedList.insertAtBegin(30);
        circularLinkedList.insertAtPosition(2, 40);
        circularLinkedList.insertAtBegin(50);
        System.out.println(circularLinkedList.deleteFromBegin());




        System.out.println(circularLinkedList.getSize());
         System.out.println(circularLinkedList);




    }
}
