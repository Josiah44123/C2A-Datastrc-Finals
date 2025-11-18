public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
        }
    }

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    // Add element
    public void add(T element) {
        root = addRecursive(root, element);
    }

    private Node<T> addRecursive(Node<T> node, T element) {
        if (node == null) {
            size++;
            return new Node<>(element);
        }

        int cmp = element.compareTo(node.data);
        if (cmp < 0) {
            node.left = addRecursive(node.left, element);
        } else if (cmp > 0) {
            node.right = addRecursive(node.right, element);
        }
        return node;
    }

    // Remove element
    public boolean remove(T element) {
        int oldSize = size;
        root = removeRecursive(root, element);
        return oldSize != size;
    }

    private Node<T> removeRecursive(Node<T> node, T element) {
        if (node == null) {
            return null;
        }

        int cmp = element.compareTo(node.data);
        if (cmp < 0) {
            node.left = removeRecursive(node.left, element);
        } else if (cmp > 0) {
            node.right = removeRecursive(node.right, element);
        } else {
            size--;
            // Node with no children
            if (node.left == null && node.right == null) {
                return null;
            }
            // Node with one child
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            // Node with two children: find the in-order successor
            Node<T> minRight = findMin(node.right);
            node.data = minRight.data;
            node.right = removeRecursive(node.right, minRight.data);
        }
        return node;
    }

    private Node<T> findMin(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Search for element
    public boolean search(T element) {
        return searchRecursive(root, element);
    }

    private boolean searchRecursive(Node<T> node, T element) {
        if (node == null) {
            return false;
        }

        int cmp = element.compareTo(node.data);
        if (cmp < 0) {
            return searchRecursive(node.left, element);
        } else if (cmp > 0) {
            return searchRecursive(node.right, element);
        }
        return true;
    }

    // In-order traversal (sorted)
    public void inOrder() {
        System.out.print("In-order:  ");
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node<T> node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderRecursive(node.right);
        }
    }

    // Pre-order traversal
    public void preOrder() {
        System.out.print("Pre-order: ");
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    // Post-order traversal
    public void postOrder() {
        System.out.print("Post-order: ");
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(Node<T> node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.data + " ");
        }
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
