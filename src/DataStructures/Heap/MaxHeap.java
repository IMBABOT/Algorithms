package DataStructures.Heap;

import java.util.Arrays;

public class MaxHeap {


    private int[] arr;
    private int size;
    private int temp;
    private int index;

    public MaxHeap(int size){
        this.size = size;
        arr = new int[size];
        temp = 0;
    }


    public void insert(int element) {
        if (temp == 0) {
            arr[temp] = element;
            temp++;
        } else if (temp == arr.length) {
            int[] temp = new int[arr.length + 1];
            System.arraycopy(arr, 0, temp, 0, arr.length);
        } else if (temp > 0) {
            arr[temp] = element;
            index = temp;
            temp++;
            while (index > 0) {
                int parent = (index - 1) / 2;
                if (arr[parent] < arr[index]) {
                    int temp1 = arr[parent];
                    arr[parent] = arr[index];
                    arr[index] = temp1;
                    index = parent;
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
