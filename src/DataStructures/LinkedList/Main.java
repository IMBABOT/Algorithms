package DataStructures.LinkedList;
public class Main {

    public static void main(String[] args) {
       DoublyCircularLinkedList<Integer> dl = new DoublyCircularLinkedList<>();
       dl.insertAtBegin(1);
       dl.insertAtBegin(2);
       dl.insertAtBegin(3);
       dl.insertAtBegin(4);

        System.out.println(dl);

    }
}
