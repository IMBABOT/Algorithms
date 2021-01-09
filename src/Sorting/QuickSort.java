package Sorting;

import java.util.Arrays;

public class QuickSort {


    public void quickSort(int[]arr, int start, int end){
        int position = 0;
        if (start < end) {
           position = partition(arr, start, end);
        }
     //   quickSort(arr, start, position - 1);
      //  quickSort(arr, position + 1, end);
    }

    private int partition(int[] arr, int start, int end){
        start = 0;
        end = arr.length - 1;
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
                int temp = arr[end];
                arr[end] = arr[0];
                arr[0] = temp;
                break;
            }

           swap(arr, start, end);

        }

        System.out.println(Arrays.toString(arr));

        return arr[end];

    }

    private void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
