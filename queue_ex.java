package collections;

public class queue_ex {
    private int[] queue;
    private int front, rear, size, capacity;

    public queue_ex(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue overflow!!");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow!!");
            return -1;
        } else {
            int item = queue[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        queue_ex queue = new queue_ex(5); // create a queue of capacity 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // Output: Queue elements: 10 20 30 

        System.out.println("Dequeued: " + queue.dequeue()); // Dequeued: 10
        queue.display();  // Output: Queue elements: 20 30 

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);  // Queue is now full
        queue.display();  // Output: Queue elements: 20 30 40 50 60 

        queue.enqueue(70); // Should print "Queue overflow!!"

        System.out.println("Front element is: " + queue.peek()); // Front element is: 20
    }
}
