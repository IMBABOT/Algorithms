package DataStructures.Heap;

public class Main {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(70);
        heap.insert(60);
        heap.insert(40);
        heap.insert(45);
        heap.insert(50);
        heap.insert(39);
        heap.insert(16);
        heap.insert(10);
        heap.insert(9);
        heap.insert(35);
        System.out.println(heap);

    }
}
