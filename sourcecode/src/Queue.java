public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue element
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (rear == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    // Dequeue element
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    // Peek at front element
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    // Search for element
    public int search(T element) {
        int position = 0;
        Node<T> current = front;
        while (current != null) {
            if (current.data.equals(element)) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    // Traverse
    public void traverse() {
        System.out.print("[");
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println("]");
    }

    // Get size
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }
}
