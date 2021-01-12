package Sorting;

public class ShellSort {

    public static int[] shellSort(int[]arr){
        int gap = 0;
        for (gap = (arr.length / 2) - 1; gap >= 1 ; gap = gap/2) {
            for (int j = gap; j < arr.length ; j++) {
                for (int i = j - gap; i >= 0 ; i = i - gap) {
                    if (arr[i + gap] > arr[i]){
                       break;
                    }else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
                
            }

        }

        return arr;
    }
}
