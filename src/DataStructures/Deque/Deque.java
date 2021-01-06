package DataStructures.Deque;

public class Deque<T> {
    private Object[] arr;

    public int getLength() {
        return length;
    }

    private int length;
    private int front;
    private int rear;

    private int size;

    public Deque(int length){
        this.length = 5;
        arr = new Object[length];
        front = -1;
        rear = -1;
        size = 0;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueueFront(T element){
       if ((size == -1 && front == -1) || (front == rear + 1)){
           throw new RuntimeException("Deque is full");
        } else if (front == - 1 && rear == -1){
            front++;
            rear++;
            arr[front] = element;
            size++;
        }else if (front == 0){
            front = arr.length -1;
            arr[front] = element;
            size++;
        }else {
            front--;
            arr[front] = element;
            size++;
        }
    }

    public void enqueueRear(T element){
        if ((size == -1 && front == -1) || (front == rear + 1)){
            throw new RuntimeException("Deque is full");
        }else if (front == - 1 && rear == -1){
            front++;
            rear++;
            arr[rear] = element;
            size++;
        }else if (rear == arr.length -1){
            rear = 0;
            arr[rear] = element;
            size++;
        }else {
            rear++;
            arr[rear] = element;
            size++;
        }
    }

    public T dequeFront() {
        T delete = null;
        if ((size == -1 && front == -1) || (front == rear + 1)) {
            throw new RuntimeException("Deque is full");
        }else if (front == rear){
            delete = (T) arr[front];
            front = rear = -1;
            size--;
        }else if (front == length - 1){
            delete = (T) arr[front];
            front = 0;
            size--;
        }else {
            delete = (T) arr[front];
            front++;
            size--;
        }
        return (T) delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = front;
        if (front == rear){
            sb.append(arr[front] + "]");
        }else {
            while (i != rear){
                sb.append(arr[i] + "," + " ");
                i = (i + 1) % arr.length;
            }
            sb.append(arr[rear]);
            sb.append("]");
        }
        return sb.toString();
    }
}
