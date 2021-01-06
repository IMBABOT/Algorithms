package DataStructures.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>(80);
        deque.enqueueFront(1);
        deque.enqueueFront(2);
        deque.enqueueFront(3);
        deque.enqueueRear(74);
        deque.enqueueFront(1);
        deque.enqueueFront(1);
        deque.enqueueFront(2);
        deque.enqueueFront(3);
        deque.enqueueRear(74);
        deque.enqueueFront(1);
        deque.enqueueFront(74);

        System.out.println(deque.dequeFront());
        System.out.println(deque.dequeFront());

        System.out.println(deque);

        System.out.println(deque.getSize());
        System.out.println(deque.getLength());
    }
}
