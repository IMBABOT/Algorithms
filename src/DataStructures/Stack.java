package DataStructures;

public class Stack {

    private int size;
    private int[] stack;
    private int top = -1;


    public Stack() {
        size = 4;
        this.stack = new int[size];
    }

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    public boolean push(int value){
        if (top == (stack.length - 1)){
            return false;
        }else {
            top++;
            stack[top] = value;
        }

        return true;
    }

}
