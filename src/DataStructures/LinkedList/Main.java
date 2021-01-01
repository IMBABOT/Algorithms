package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertInTail(0);
        linkedList.insertInTail(1);
        linkedList.insertInTail(2);
        linkedList.insertInTail(3);
        linkedList.insertInTail(4);
        System.out.println(linkedList.getSize());
        linkedList.removeFromPosition(1);
        linkedList.removeFromPosition(3);
        linkedList.removeFromPosition(1);
        linkedList.removeFromPosition(0);
        linkedList.removeFromPosition(0);
        System.out.println(linkedList);
        System.out.println(linkedList.getLength());


    }
}
