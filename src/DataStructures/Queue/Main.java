package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
        StackQueue<Integer> stackQueue = new StackQueue<>();
        stackQueue.enqueue(1);
        stackQueue.enqueue(2);
        stackQueue.enqueue(3);
        stackQueue.enqueue(4);


        System.out.println(stackQueue);
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue);
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue.peek());



        CircularQueue<Integer> circularQueue = new CircularQueue<>();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);

        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue);




    }
}
