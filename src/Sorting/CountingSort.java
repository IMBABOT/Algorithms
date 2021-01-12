package Sorting;

public class CountingSort {

    public static int[] countingSort(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            if (i == 0){
                count[arr[i]]--;
            }
            if (i == arr.length-1){
                count[arr[i]]++;
            }
        }

        for (int i = 1; i <count.length ; i++) {
            count[i] = count[i] + count[i - 1];
        }
        return count;
    }
}
