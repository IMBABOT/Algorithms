public class LinearSearch {

    public static int linearSearch(int[] arr, int element){
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == element){
                result = arr[i];
                break;
            }else {
                throw new RuntimeException("No such element: " + element);
            }
        }
        return result;
    }

    public static int findIndex(int[] arr, int index){
        int i = 0;
        int result = 0;

        while (i < arr[i]){
            if (i == index){
                result = arr[i];
                break;
            }
            i++;
        }

        return result;
    }
}
