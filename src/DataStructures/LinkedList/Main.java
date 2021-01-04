package DataStructures.LinkedList;
public class Main {

    public static void main(String[] args) {
       DoublyCircularLinkedList<Integer> dl = new DoublyCircularLinkedList<>();
       dl.insertAtBegin(1);
       dl.insertAtBegin(2);
       dl.insertAtBegin(3);
       dl.insertAtBegin(4);

       dl.insertInEnd(5);
       dl.insertInEnd(8);

        System.out.println(dl);
        dl.insertAtBegin(1);
        dl.insertInEnd(2);
        System.out.println(dl);
        dl.insertInPos(5, 5);
        dl.insertInPos(2, 13);
        dl.insertInPos(9, 10);
        dl.insertInPos(1, 10);
        dl.insertInPos(13, 1);
        dl.insertInPos(13, 85);
        dl.insertInPos(15, 35);
        dl.insertInPos(3, 14);
        System.out.println(dl);
        System.out.println(dl.getSize());
    }
}
