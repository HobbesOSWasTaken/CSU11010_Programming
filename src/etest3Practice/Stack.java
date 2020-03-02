package etest3Practice;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack = new ArrayList<Integer>();
    private static final int ERROR = -1;

    public void push(int integer) {
        stack.add(integer);
    }

    public int pop() {
        if(!stack.isEmpty()) {
            int topOfStack = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return topOfStack;
        }
        return ERROR;
    }

    public int peek() {
        if(!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return ERROR;
    }

    public int search(int element) {
        for(int index = 0; index < stack.size(); index++) {
            if(stack.get(index) == element) {
                return index;
            }
        }
        return ERROR;
    }

    public void move(int element) {
        if(search(element) != ERROR) {
            push(element);
        }
    }
}
