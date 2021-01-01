package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertInTail(0);
        linkedList.insertInTail(1);
        linkedList.insertInTail(2);
        linkedList.insertInTail(3);
        linkedList.insertInTail(4);
        System.out.println(linkedList);
        linkedList.removeFromPosition(4);
        System.out.println(linkedList);

    }
}
