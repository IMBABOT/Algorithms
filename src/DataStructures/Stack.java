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

    public void push(int value){
       if (top == stack.length){
           int[] temp = new int[stack.length * 2];
           System.arraycopy(stack, 0, temp, 0, stack.length);
           stack = temp;
       }
       if (top == -1){
           top = 0;
       }
       stack[top++] = value;
    }

    public int pop(){
        int temp;
        if (top == 0){
            throw new RuntimeException("Stack is empty");
        }else {
           temp = stack[--top];
        }
        return temp;
    }

    public int peek(){
        int temp;
        if (top == 0) {
            throw new RuntimeException("Stack is empty");
        }else {
            temp = stack[--top];
            top++;
        }

        return temp;
    }



    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < top ; i++) {
            result +=","  + stack[i];
        }

        if (top > 1) {
            result = result.substring(1);
        }
        return result;
    }
}
