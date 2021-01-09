import Sorting.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 10, 11, 3, 2, -35, -85, 85, 112};
        System.out.println(InsertionSort.insertionSort(arr));
        System.out.println(Arrays.toString(arr));

    }

}
