package MyStack;

public class MyStack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if(top == stack.length) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top] = data;
        top++;
    }

    public int pop() {
        if(top == 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            top--;
            int data = stack[top];
            stack[top] = 0;
            return data;
        }
    }

    public int peek() {
        if(top == 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[top - 1];
        }
    }

    public void show() {
        for(int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}