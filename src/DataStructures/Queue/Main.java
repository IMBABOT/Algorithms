package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
       LinkedCircularQueue<Integer> linkedCircularQueue = new LinkedCircularQueue<>();

       linkedCircularQueue.enqueue(1);
       linkedCircularQueue.enqueue(2);
       linkedCircularQueue.enqueue(3);
       linkedCircularQueue.enqueue(3);
       linkedCircularQueue.enqueue(5);
       linkedCircularQueue.enqueue(7);
       linkedCircularQueue.enqueue(8);

        System.out.println(linkedCircularQueue);
        System.out.println(linkedCircularQueue.getSize());
    }
}
