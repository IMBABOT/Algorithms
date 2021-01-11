package Sorting;

public class HeapSort {

    private static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;


        while (left < n && arr[left] > arr[largest]){
            largest = left;
        }
        while (right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }

    }

    public int[] heapSort(int[] arr){
        int n = arr.length;

        for (int i = n/2-1; i >=0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n-1; i > 0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }
}
