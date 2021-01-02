package DataStructures.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        List<Integer> list = new LinkedList<>();

        doublyLinkedList.insertInEnd(10);
        doublyLinkedList.insertInEnd(20);
        doublyLinkedList.insertInEnd(30);
        doublyLinkedList.insertInEnd(40);
        doublyLinkedList.insertInEnd(50);
        doublyLinkedList.insertInBegin(10);
        doublyLinkedList.insertInBegin(60);
        doublyLinkedList.insertInPosition(80, 3);
        doublyLinkedList.insertInPosition(90, 7);



        System.out.println(doublyLinkedList.size);

        System.out.println(doublyLinkedList);

    }
}
