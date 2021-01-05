package DataStructures.Queue;

public class CircularQueue<T> {
    private int length;
    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(){
        size = 0;
        length = 10;
        queue = new Object[length];
        front = -1;
        rear = -1;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void enqueue(int element) {
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            queue[front] = element;
            size++;
        } else if ((rear + 1) % length == front) {
            throw new RuntimeException("Queue is full");
        } else {
            rear = (rear + 1) % length;
            queue[rear] = element;
            size++;
        }
    }

    public T peek(){
        T element;
        if (front == -1 && rear == -1) {
            throw new RuntimeException("Queue is empty");
        }else {
            element = (T) queue[front];
        }
        return element;
    }

    public T dequeue(){
        T element;
        if (front == -1 && rear == -1) {
            throw new RuntimeException("Queue is empty");
        }else if (rear == front){
            element = (T) queue[rear];
            rear = front = -1;
            size--;
        }else {
            element = (T) queue[front];
            front = (front + 1) % length;
            size--;
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
            while (i < length){
                sb.append(queue[i]);
                i++;
                sb.append((i == rear+1) ? "]" : ", ");
            }
        }
        return sb.toString();
    }
}


