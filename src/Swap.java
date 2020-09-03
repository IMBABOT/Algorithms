public class Swap {

    public int[] swap(int first, int second, int arr[]){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return arr;
    }
}
