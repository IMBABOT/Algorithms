package DataStructures.LinkedList;



public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.insertAtBegin(1);
        circularLinkedList.insertAtBegin(2);
        circularLinkedList.insertAtBegin(3);
        circularLinkedList.insertAtBegin(4);
        circularLinkedList.insertAtBegin(5);
        circularLinkedList.insertAtBegin(8);
        circularLinkedList.insertInEnd(1);
        circularLinkedList.insertInEnd(56);
        circularLinkedList.insertInEnd(856);
        circularLinkedList.insertAtBegin(1);
        circularLinkedList.insertInEnd(85);

        System.out.println(circularLinkedList);

    }
}
