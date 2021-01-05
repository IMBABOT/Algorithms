package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<>();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(56);
        circularQueue.enqueue(56);
        circularQueue.enqueue(56);
        circularQueue.enqueue(56);
        circularQueue.enqueue(56);
        circularQueue.enqueue(56);
        circularQueue.enqueue(56);
        System.out.println(circularQueue);
        System.out.println(circularQueue.getSize());
        System.out.println(circularQueue.peek());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue);
        System.out.println(circularQueue.peek());
        System.out.println(circularQueue);
    }
}
