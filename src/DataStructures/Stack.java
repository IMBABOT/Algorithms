package DataStructures;

import java.util.Arrays;

public class Stack {

    private int size;
    private int[] stack;
    private int top = 0;


    public Stack() {
        size = 4;
        this.stack = new int[size];
    }

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    public void push(int value){
       if (top == stack.length){
           int[] temp = new int[stack.length * 2];
           System.arraycopy(stack, 0, temp, 0, stack.length);
           stack = temp;
       }
       stack[top++] = value;
    }



    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < top ; i++) {
            result +=","  + stack[i];
        }

        result = result.substring(1);

        return result;
    }
}
