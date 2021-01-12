package Sorting;


public class CountingSort {

    public static int[] countingSort(int[] arr){
        int max = arr[0];

        int temp1 = arr[arr.length-1];
        int last = arr[arr.length-1];
        int[] tempArr = new int[arr.length];
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

        for (int i = arr.length - 1; i >= 0; i--) {
            tempArr[--count[arr[i]]] = arr[i];
        }

        int index = count[temp1];
        index--;
        arr = tempArr;
        if (temp1 > arr[arr.length-1]) {
            arr[arr.length - 1] = temp1;
        }else if (temp1 < arr[arr.length-1]){
            arr[index] = temp1;
        }



        return arr;
    }
}
