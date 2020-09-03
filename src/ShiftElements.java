public class ShiftElements {


    public static void shiftElements(int[] arr, int n){
        int Start = 0;
        int End = arr.length - n - 1;

        while (Start < End){
            int temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp;

            Start++;
            End--;
        }

        shiftSecondPart(arr, n);
        shiftWhole(arr, n);

    }

    private static void shiftSecondPart(int[] arr, int n){
        int first = arr.length - n;
        int end = arr.length - 1;


        while (first < end){
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;

            first++;
            end--;
        }
    }

    private static void shiftWhole(int[] arr, int n){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
