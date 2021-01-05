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
        System.out.println(stackQueue);
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue);
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue);
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue);





    }
}
