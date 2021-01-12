import Sorting.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[]arr = new int[]{170, 45, 75, 90, 802, 24, 2, 66 };
       int[]arr1 = new int[]{11,3,4,2,1,10};

        System.out.println(Arrays.toString(RadixSort.radixSort(arr)));
    }

}
