package DataStructures.BinaryTree;

import Sorting.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,7,3,1,4,2,10,-110};
        MergeSort.mergeSort(arr, 0, arr.length -1);
        System.out.printf(Arrays.toString(arr));

    }
}
