package Sorting;

import java.util.Arrays;

public class QuickSort {



    public void quickSort(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int pivot = arr[start];

        System.out.println(Arrays.toString(arr));
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start > end){
                break;
            }
            swap(arr, start, end);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[start]);

    }

    private void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
