package DataStructures.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        List<Integer> list = new LinkedList<>();

        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);

        System.out.println(doublyLinkedList);

    }
}
