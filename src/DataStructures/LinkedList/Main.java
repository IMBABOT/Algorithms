package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(linkedList.isEmpty());
        linkedList.insert(10);
        System.out.println(linkedList);
        linkedList.insert(20);
        linkedList.remove();
        System.out.println(linkedList);
    }
}
