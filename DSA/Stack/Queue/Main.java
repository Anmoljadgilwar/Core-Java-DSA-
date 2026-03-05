
public class ArrayQueue {

    int maxSize;
    int[] queue;
    int front;
    int rear;

    // Constructor
    ArrayQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow! Cannot insert " + value);
            return;
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = value;
        System.out.println(value + " inserted into queue.");
    }

    // Dequeue operation
    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! Queue is empty.");
            return -1;
        }

        int value = queue[front++];
        return value;
    }

    // Peek operation
    int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return queue[front];
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue(5);

        // Demonstrating operations
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Front element: " + q.peek());

        System.out.println("Deleted element: " + q.dequeue());

        q.display();
    }
}
{
   
}
