import Sorting.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{7,6,10,5,9,2,1,15,7};
        quickSort.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
