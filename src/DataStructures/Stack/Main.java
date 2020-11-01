package DataStructures.Stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(25);
        stack.push(152);
        stack.push(123);

        System.out.println(stack.getSize());

        stack.reverse();



      //  System.out.println(stack);



    }

}
