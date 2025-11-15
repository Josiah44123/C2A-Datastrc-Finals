public class Stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Push element
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop element
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Peek at top element
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Search for element (distance from top, 1-indexed)
    public int search(T element) {
        int position = 1;
        Node<T> current = top;
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
        Node<T> current = top;
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
