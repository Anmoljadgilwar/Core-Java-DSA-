
class ArrayStack {

    int maxSize;
    int[] stackArray;
    int top;

    // Constructor
    ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is empty
    }

    // Push operation
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if empty
    boolean isEmpty() {
        return (top == -1);
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        // Demonstrating operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
