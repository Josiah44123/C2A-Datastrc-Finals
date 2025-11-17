import java.util.Scanner;

public class DataStructureApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            displayMainMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    runArrayListDemo();
                    break;
                case 2:
                    runLinkedListDemo();
                    break;
                case 3:
                    runStackDemo();
                    break;
                case 4:
                    runQueueDemo();
                    break;
                case 5:
                    runBSTDemo();
                    break;
                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    private static void displayMainMenu() {
        System.out.println("\n========== DATA STRUCTURES MENU ==========");
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Stack");
        System.out.println("4. Queue");
        System.out.println("5. Binary Search Tree");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    private static void runArrayListDemo() {
        ArrayList<Integer> list = new ArrayList<>();
        boolean inMenu = true;
        while (inMenu) {
            displayArrayListMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Options ---");
                    System.out.println("1. Add at End");
                    System.out.println("2. Add at Start");
                    System.out.println("3. Add at Specific Index");
                    System.out.print("Choose: ");
                    int addChoice = getIntInput();
                    System.out.print("Enter value to add: ");
                    int value = getIntInput();
                    if (addChoice == 1) {
                        list.addAtEnd(value);
                    } else if (addChoice == 2) {
                        list.addAtStart(value);
                    } else if (addChoice == 3) {
                        System.out.print("Enter index: ");
                        int idx = getIntInput();
                        try {
                            list.addAtIndex(idx, value);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index!");
                            break;
                        }
                    } else {
                        System.out.println("Invalid choice!");
                        break;
                    }
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index to remove: ");
                    int index = getIntInput();
                    try {
                        list.remove(index);
                        System.out.println("Removed successfully!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int result = list.search(getIntInput());
                    if (result >= 0) {
                        System.out.println("Found at index: " + result);
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    list.sort();
                    System.out.println("Sorted!");
                    break;
                case 5:
                    System.out.print("ArrayList: ");
                    list.traverse();
                    break;
                case 6:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayArrayListMenu() {
        System.out.println("\n--- ArrayList Operations ---");
        System.out.println("1. Add (End/Start/Index)");
        System.out.println("2. Remove by Index");
        System.out.println("3. Search");
        System.out.println("4. Sort");
        System.out.println("5. Display");
        System.out.println("6. Back to Main Menu");
        System.out.print("Choose an option: ");
    }

    private static void runLinkedListDemo() {
        LinkedList<Integer> list = new LinkedList<>();
        boolean inMenu = true;
        while (inMenu) {
            displayLinkedListMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Options ---");
                    System.out.println("1. Add at End");
                    System.out.println("2. Add at Start");
                    System.out.println("3. Add at Specific Index");
                    System.out.print("Choose: ");
                    int addChoice = getIntInput();
                    System.out.print("Enter value to add: ");
                    int value = getIntInput();
                    if (addChoice == 1) {
                        list.addAtEnd(value);
                    } else if (addChoice == 2) {
                        list.addAtStart(value);
                    } else if (addChoice == 3) {
                        System.out.print("Enter index: ");
                        int idx = getIntInput();
                        try {
                            list.addAtIndex(idx, value);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index!");
                            break;
                        }
                    } else {
                        System.out.println("Invalid choice!");
                        break;
                    }
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index to remove: ");
                    int index = getIntInput();
                    try {
                        list.remove(index);
                        System.out.println("Removed successfully!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int result = list.search(getIntInput());
                    if (result >= 0) {
                        System.out.println("Found at index: " + result);
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    list.sort();
                    System.out.println("Sorted!");
                    break;
                case 5:
                    System.out.print("LinkedList: ");
                    list.traverse();
                    break;
                case 6:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayLinkedListMenu() {
        System.out.println("\n--- LinkedList Operations ---");
        System.out.println("1. Add (End/Start/Index)");
        System.out.println("2. Remove by Index");
        System.out.println("3. Search");
        System.out.println("4. Sort");
        System.out.println("5. Display");
        System.out.println("6. Back to Main Menu");
        System.out.print("Choose an option: ");
    }

    private static void runStackDemo() {
        Stack<Integer> stack = new Stack<>();
        boolean inMenu = true;
        while (inMenu) {
            displayStackMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(getIntInput());
                    System.out.println("Pushed successfully!");
                    break;
                case 2:
                    try {
                        Integer popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (IllegalStateException e) {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    try {
                        Integer top = stack.peek();
                        System.out.println("Top element: " + top);
                    } catch (IllegalStateException e) {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    int result = stack.search(getIntInput());
                    if (result >= 0) {
                        System.out.println("Found at position: " + result);
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 5:
                    System.out.print("Stack: ");
                    stack.traverse();
                    break;
                case 6:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayStackMenu() {
        System.out.println("\n--- Stack Operations ---");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Search");
        System.out.println("5. Display");
        System.out.println("6. Back to Main Menu");
        System.out.print("Choose an option: ");
    }

    private static void runQueueDemo() {
        Queue<Integer> queue = new Queue<>();
        boolean inMenu = true;
        while (inMenu) {
            displayQueueMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    queue.enqueue(getIntInput());
                    System.out.println("Enqueued successfully!");
                    break;
                case 2:
                    try {
                        Integer dequeued = queue.dequeue();
                        System.out.println("Dequeued: " + dequeued);
                    } catch (IllegalStateException e) {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    try {
                        Integer front = queue.peek();
                        System.out.println("Front element: " + front);
                    } catch (IllegalStateException e) {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    int result = queue.search(getIntInput());
                    if (result >= 0) {
                        System.out.println("Found at position: " + result);
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 5:
                    System.out.print("Queue: ");
                    queue.traverse();
                    break;
                case 6:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayQueueMenu() {
        System.out.println("\n--- Queue Operations ---");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Search");
        System.out.println("5. Display");
        System.out.println("6. Back to Main Menu");
        System.out.print("Choose an option: ");
    }

    private static void runBSTDemo() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        boolean inMenu = true;
        while (inMenu) {
            displayBSTMenu();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    bst.add(getIntInput());
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    System.out.print("Enter value to remove: ");
                    boolean removed = bst.remove(getIntInput());
                    if (removed) {
                        System.out.println("Removed successfully!");
                    } else {
                        System.out.println("Value not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    boolean found = bst.search(getIntInput());
                    if (found) {
                        System.out.println("Found!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    System.out.println("BST Traversals:");
                    bst.inOrder();
                    bst.preOrder();
                    bst.postOrder();
                    break;
                case 5:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayBSTMenu() {
        System.out.println("\n--- Binary Search Tree Operations ---");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Search");
        System.out.println("4. Display (All Traversals)");
        System.out.println("5. Back to Main Menu");
        System.out.print("Choose an option: ");
    }

    private static int getIntInput() {
        try {
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        } catch (java.util.InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Try again: ");
            return getIntInput();
        }
    }
}

class ArrayList<T> {
    // addAtEnd, addAtStart, and addAtIndex methods
    public void addAtEnd(T value) {
      
    }

    public void addAtStart(T value) {
    
    }

    public void addAtIndex(int index, T value) throws IndexOutOfBoundsException {
       
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        // Remove value at the specified index
    }

    public int search(T value) {
       
        return -1; 
    }

    public void sort() {
      
    }

    public void traverse() {
       
    }
}

class LinkedList<T> {
    //LinkedList with addAtEnd, addAtStart, and addAtIndex methods
    public void addAtEnd(T value) {
        // Add value at the end of the list
    }

    public void addAtStart(T value) {
        // Add value at the start of the list
    }

    public void addAtIndex(int index, T value) throws IndexOutOfBoundsException {
        // Add value at the specified index
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        // Remove value at the specified index
    }

    public int search(T value) {
        // Search for value in the list
        return -1; // Placeholder return value
    }

    public void sort() {
        // Sort the list
    }

    public void traverse() {
        // Traverse and print the list
    }
}

class Stack<T> {
   
    public void push(T value) {
        // Push value onto the stack
    }

    public T pop() throws IllegalStateException {
        // Pop value from the stack
        return null; 
    }

    public T peek() throws IllegalStateException {
        // Peek at the top value of the stack
        return null; 
    }

    public int search(T value) {
        // Search for value in the stack
        return -1;
    }

    public void traverse() {
        // Traverse and print the stack
    }
}

class Queue<T> {
    // Implementation of Queue with enqueue, dequeue, peek, and search methods
    public void enqueue(T value) {
      
    }

    public T dequeue() throws IllegalStateException {
        // Dequeue value from the queue
        return null; 
    }

    public T peek() throws IllegalStateException {
        // Peek at the front value of the queue
        return null;
    }

    public int search(T value) {
        // Search for value in the queue
        return -1; 
    }

    public void traverse() {
        // Traverse and print the queue
    }
}

class BinarySearchTree<T> {
    //add, remove, search, inOrder, preOrder, and postOrder methods
    public void add(T value) {
        // Add value to the BST
    }

    public boolean remove(T value) {
        // Remove value from the BST
        return false; 
    }

    public boolean search(T value) {
        // Search for value in the BST
        return false; 
    }

    public void inOrder() {
   
    }

    public void preOrder() {
     
    }

    public void postOrder() {
      
    }
}
