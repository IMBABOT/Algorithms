package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end){
        if (start < end){
            int mid = start + (end-start) / 2;
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
            if (arr[i] < arr[j]){
                result[k] = arr[i];
                i++;
            }else {
                result[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid){
            while (j < end){
                result[k] = arr[j];
                k++;
                j++;
            }
        }else {
            while (i <= mid){
                result[k] = arr[i];
                k++;
                i++;
            }
        }
        for (int l = start; l <=end ; l++) {
            result[l] = arr[l];
        }
    }
}
