package DataStructures.Queue;

public class Queue<T> {

    private int size;
    private int front;
    private int rear;
    private Object[] queue;

    public Queue(int size){
        this.size = size;
        queue = new Object[size];
        front = -1;
        rear = -1;
    }


    public void enqueue(T element){
        if (rear == size){
            throw new RuntimeException("queue if full " + size);
        }else if (front == -1 && rear == -1){
            front = rear = 0;
            queue[rear] = element;
        }else {
            rear++;
            queue[rear] = element;
        }
    }

    public void


    @Override
    public String toString() {
        return super.toString();
    }
}
