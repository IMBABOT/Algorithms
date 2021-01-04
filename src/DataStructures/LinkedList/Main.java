package DataStructures.LinkedList;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.insertAtBegin(1);
        circularLinkedList.insertAtBegin(2);
        circularLinkedList.insertAtBegin(3);
        circularLinkedList.insertAtEnd(4);
        circularLinkedList.insertAtEnd(5);
        circularLinkedList.insertAtPosition(1, 8);
        circularLinkedList.insertAtPosition(6, 12);
        circularLinkedList.insertAtPosition(2, 79);
        circularLinkedList.insertAtPosition(3, 64);




        System.out.println(circularLinkedList.getSize());
         System.out.println(circularLinkedList);



    }
}
