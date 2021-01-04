package DataStructures.LinkedList;



public class Main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.insertAtBegin(1);
        circularLinkedList.insertAtBegin(2);
        circularLinkedList.insertAtBegin(3);
        circularLinkedList.insertAtBegin(4);

        System.out.println(circularLinkedList);

    }
}
