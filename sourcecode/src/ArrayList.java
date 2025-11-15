public class ArrayList<T extends Comparable<T>> {
    private T[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        this.data = (T[]) new Comparable[INITIAL_CAPACITY];
        this.size = 0;
    }

    // Add element at the end
    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    // Add element at specific index
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == data.length) {
            resize();
        }
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    // Remove element at index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        @SuppressWarnings("unchecked")
        T removed = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return removed;
    }

    // Remove by value
    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    // Search for element
    public int search(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // Get element at index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        @SuppressWarnings("unchecked")
        T element = data[index];
        return element;
    }

    // Sort using QuickSort (average O(n log n))
    public void sort() {
        quickSort(0, size - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        @SuppressWarnings("unchecked")
        T pivot = data[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (data[j].compareTo(pivot) < 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        @SuppressWarnings("unchecked")
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // Traverse
    public void traverse() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) System.out.print(", ");
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

    // Resize internal array
    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newData = (T[]) new Comparable[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}
