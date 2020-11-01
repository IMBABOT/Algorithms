public class Swap<T> {

    public T[] changeElements(T[] arr, int first, int second){
        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return arr;
    }
}

