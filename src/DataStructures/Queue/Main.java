package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<>();
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);


        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.peek());

        System.out.println(circularQueue);

    }
}
