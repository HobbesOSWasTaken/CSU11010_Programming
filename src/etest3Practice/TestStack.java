package etest3Practice;

public class TestStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for(int num = 1; num <= 10; num++) {
            stack.push(num);
        }

        System.out.println("Popping the top element returns: " + stack.pop());
        System.out.println("Peeking at the top element returns: " + stack.peek());
        System.out.println("Searching for 7 returns an index of: " + stack.search(7));
        System.out.println("Moving element 5 to top of stack.");
        stack.move(5);
        System.out.println("Now popping returns: " + stack.pop());
    }
}
