package DataStructures.Heap;

public class Heap {


    private int[] arr;
    private int size;

    public Heap(){
        this.size = 1;
        arr = new int[size];
    }


    public void insert(int element){
        int[] temp = new int[size + 1];;
        temp[temp.length- 1] = element;
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        int i = arr.length - 1;
        int parent = (i - 1) / 2;

        if (i == 1){
            arr[i] = element;
            i++;
        }else if (i > 1) {
            while (i > 1) {
                if (arr[parent] < arr[i]) {
                    int t = arr[parent];
                    arr[parent] = arr[i];
                    arr[i] = t;
                    i = parent;
                } else {
                    return;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (i < arr.length){
            sb.append(arr[i] + ", ");
            i++;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }

}
