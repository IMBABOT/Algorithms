package DataStructures;

import java.util.Arrays;

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

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i <= top ; i++) {
            result +="," + stack[i];
        }

        result = result.substring(1);

        return result;
    }
}
