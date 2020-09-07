public class ShiftElementsLeft {

    public void shiftLeft(int[] arr, int n){
        int start = 0;
        int temporary = arr.length + n;
        int end = arr.length - temporary - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        shiftSecondPart(arr, n);
        shiftWhole(arr, n);

    }

    private void shiftSecondPart(int[] arr, int n){
        int start = n * (-1);
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    private void shiftWhole(int[] arr, int n){
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
