package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();


        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);

        System.out.println(doublyLinkedList);

    }
}
