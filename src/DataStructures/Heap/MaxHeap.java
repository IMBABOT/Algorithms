package DataStructures.Heap;

import java.util.Arrays;

public class MaxHeap {


    private int[] arr;
    private int size;
    private int temp;

    public MaxHeap(int size){
        this.size = size;
        arr = new int[size];
        temp = 0;
    }


    public void insert(int element){
        if (temp == 0){
            arr[temp] = element;
            temp++;
        }else if (temp > 0) {
            arr[temp] = element;
            int i = temp;
            temp++;
            while (i > 0) {
                int parent = (i - 1) / 2;
                if (arr[parent] < arr[i]) {
                    int temp1 = arr[parent];
                    arr[parent] = arr[i];
                    arr[i] = temp1;
                    i = parent;
                } else {
                    return;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (i < arr.length){
            sb.append(arr[i] + ", ");
            i++;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }

}
