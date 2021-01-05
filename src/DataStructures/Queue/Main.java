package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);

        System.out.println(linkedQueue);
        System.out.println(linkedQueue.getSize());

    }
}
