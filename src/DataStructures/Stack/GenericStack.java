package DataStructures.Stack;

public class GenericStack<T> {

    public int getSize() {
        return size;
    }

    private int size;
    private Object[] stack;
    private int top;


    public GenericStack() {
        size = 1;
        top = 0;
        this.stack = new Object[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void push(T element){
        if (top == stack.length){
            Object[] temp = new Object[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }

        stack[top++] = element;
        size = top;
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

    public T reverse(){
        Object[] result = new Object[top];
        for (int i = 0; i <result.length ; i++) {
            result[i] = pop();
        }
        return (T) result;
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