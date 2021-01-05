package DataStructures.Stack;

import java.util.Arrays;

public class GenericStack<T> {

    public int getSize() {
        return size;
    }

    private int size;
    private Object[] stack;
    private int top;
    private Object[] copy;

    private int i;


    public GenericStack() {
        size = 1;
        top = 0;
        this.copy = new Object[size];
        this.stack = new Object[size];
        i = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void push(T element){
        if (top == stack.length){
            Object[] temp = new Object[stack.length * 2];
            Object[] temp1 = new Object[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            System.arraycopy(stack, 0, temp1, 0, stack.length);
            stack = temp;
            copy = temp1;
        }
        while (i <= top){
           copy[i++] = element;
        }
        stack[top++] = element;
        size = top;
    }

    public Object[] peekElement(){
        return copy;
    }

    public T pop(){
        Object temp;
        if (top == 0){
            throw new RuntimeException("Stack is empty");
        }else {
            temp = stack[--top];
        }

        size = top;
        return (T)temp;
    }

    public T peek(){
        T temp;
        if (top == 0) {
            throw new RuntimeException("Stack is empty");
        }else {
            temp = (T) stack[--top];
            ++top;
        }
        return temp;
    }

    public Object[] reverse(){
        Object[] result = new Object[top];
        for (int i = 0; i <result.length ; i++) {
            result[i] = pop();
        }
        return  result;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < top ; i++) {
            sb.append(stack[i] + "," + " ");
        }
        sb.deleteCharAt(sb.length()-2);
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}