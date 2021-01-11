package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end){
        if (start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int k = start;
        int[] result = new int[arr.length];

        while (i <= mid && j <= end){
            if (arr[i] <= arr[j]){
                result[k] = arr[i];
                i++;
            }else {
                result[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            result[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end){
            result[k] = arr[j];
            k++;
            j++;
        }

        for (int l = start; l <=end ; l++) {
           arr[l] = result[l];
        }
    }
}
