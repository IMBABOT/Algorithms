public class Reverse {
    //O(n)
    public int[] reverse(int[]arr){
        int start = 0;
        int end = arr.length;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}