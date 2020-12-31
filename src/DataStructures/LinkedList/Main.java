package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(linkedList.isEmpty());
        linkedList.insertInHead(10);
       // System.out.println(linkedList);
        linkedList.insertInHead(20);
       // System.out.println(linkedList);
        linkedList.insertInTail(30);
        linkedList.insertInHead(10);
        System.out.println(linkedList);
        linkedList.insertInTail(80);
        System.out.println(linkedList);
    }
}
