

public class ReverseSpace {

    public int[] reverseWithSpace(int[]arr){
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length && end >=0){
            result[end] = arr[start];
            start++;
            end--;
        }


        return result;
    }
}
