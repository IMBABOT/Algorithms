import Sorting.CountingSort;
import Sorting.HeapSort;
import Sorting.InsertionSort;
import Sorting.ShellSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        System.out.println(Arrays.toString(CountingSort.countingSort(arr)));
    }

}
