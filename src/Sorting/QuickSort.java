package Sorting;

import java.util.Arrays;

public class QuickSort {


    public void quickSort(int[]arr, int start, int end){
        if (start < end) {
            int position = partition(arr, start, end);

            quickSort(arr, start, position - 1);
            quickSort(arr, position, end);
        }
    }

    private int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        return start;
    }
}