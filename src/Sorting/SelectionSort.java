package Sorting;

public class SelectionSort {

    //O(n*n)
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min_index] > arr[j]){
                    min_index = j;

                    int temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
        }

        return arr;
    }
}


