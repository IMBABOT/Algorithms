package DataStructures.Queue;

public class Queue<T> {

    private int length;
    private int front;
    private int rear;
    private Object[] queue;

    public int getSize() {
        return size;
    }

    private int size;


    public Queue(int length){
        this.length = length;
        queue = new Object[length];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void enqueue(T element){
        if (rear == length){
            throw new RuntimeException("queue if full " + length);
        }else if (front == -1 && rear == -1){
            front = rear = 0;
            queue[rear] = element;
            size++;
        }else {
            rear++;
            queue[rear] = element;
            size++;
        }
    }

    public T dequeue(){
        T element;
        if (front == -1 && rear == -1){
            throw new RuntimeException("queue is empty");
        }else if (front == rear){
            element = (T)queue[front];
            front = rear = -1;
            size--;
        }else {
            element = (T)queue[front];
            front++;
            size--;
        }
        return element;
    }

    public T peek() {
        T element;
        if (front == -1 && rear == -1) {
            throw new RuntimeException("queue is empty");
        }else {
            element = (T) queue[front];
        }
        return element;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = front;
        if (front == -1 && rear == -1){
            throw new RuntimeException("Queue is empty");
        }else if (front == rear){
            sb.append(queue[front] + "]");
        }else {
            while (i < rear+1){
                sb.append(queue[i]);
                i++;
                sb.append((i == rear+1) ? "]" : ", ");
            }
        }
        return sb.toString();
    }
}
