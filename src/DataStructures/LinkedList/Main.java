package DataStructures.LinkedList;
public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.insertAtPosition(1, 10);
        circularLinkedList.insertAtBegin(20);
        circularLinkedList.insertAtEnd(80);


        System.out.println(circularLinkedList);
        System.out.println(circularLinkedList.getSize());


    }
}
