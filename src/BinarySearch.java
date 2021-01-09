public class BinarySearch {


    public static int binarySearch(int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            if (element == arr[mid]) {
                return mid;
            }else if (element < arr[mid]){
                end = mid - 1;
                mid = (start + end) / 2;
            }else if (element > arr[mid]){
                start = mid + 1;
                mid = (start + end) / 2;
            }else {
                throw new RuntimeException("No such element");
            }
        }
        return mid;
    }
}
