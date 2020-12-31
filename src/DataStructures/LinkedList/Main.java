package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertInHead(10);
        linkedList.insertInHead(20);
        linkedList.insertInTail(30);
        linkedList.insertInHead(10);
        linkedList.insertInTail(80);
        linkedList.insertInSpecific(1, 40);
        System.out.println(linkedList);
        linkedList.deleteFromTail();
        System.out.println(linkedList);
    }
}
