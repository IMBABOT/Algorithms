import Sorting.CountingSort;
import Sorting.HeapSort;
import Sorting.InsertionSort;
import Sorting.ShellSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{81,1,4,5,36,3,37,1,3,3,2,3,186,7};
        System.out.println(Arrays.toString(CountingSort.countingSort(arr)));
    }

}
