package DataStructures.Stack;

import java.util.Arrays;

public class Stack {

    public int getSize() {
        return size;
    }

    private int size;
    private int[] stack;
    private int top = 0;


    public Stack() {
        size = 0;
        this.stack = new int[size];
    }

    public boolean isEmpty(){
        return size == 0;
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
       size = top;
    }

    public int pop(){
        int temp;
        if (top == 0){
            throw new RuntimeException("Stack is empty");
        }else {
           temp = stack[--top];
        }

        size = top;
        return temp;
    }

    public int peek(){
        int temp;
        if (top == 0) {
            throw new RuntimeException("Stack is empty");
        }else {
            temp = stack[--top];
            ++top;
        }
        return temp;
    }

    public int[] reverse(){
        int[] result = new int[top];

        for (int i = 0; i <result.length ; i++) {
            result[i] = pop();
        }

        return result;

    }



    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < top ; i++) {
           result += " " + stack[i];
        }

        result = result.substring(1);

        return result;
    }
}
