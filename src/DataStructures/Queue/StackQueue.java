package DataStructures.Queue;

import DataStructures.Stack.GenericStack;

public class StackQueue<T> {
    private GenericStack<T> first;
    private GenericStack<T> second;


    public StackQueue(){
        first = new GenericStack<>();
        second = new GenericStack<>();

    }



}