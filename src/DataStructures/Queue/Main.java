package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
