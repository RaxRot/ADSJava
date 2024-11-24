package MyBinarySearchTree;

public class BinarySearchTree {
    Node root;

    // Insert data
    private Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.getData()) {
            // left subtree
            root.setLeft(insert(root.getLeft(), data));
        } else if (data > root.getData()) {
            // right subtree
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    // Left-Root-Right (Inorder)
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeft());
        System.out.println(root.getData());
        inorder(root.getRight());
    }

    // Root-Left-Right (Preorder)
    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    // Left-Right-Root (Postorder)
    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.println(root.getData());
    }

    // Search Element
    private boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.getData() == key) {
            return true;
        } else if (root.getData() > key) {
            return search(root.getLeft(), key);
        } else {
            return search(root.getRight(), key);
        }
    }

    public boolean search(int key) {
        return search(root, key);
    }

    public Node getRoot() {
        return root;
    }

    // Count leaves (without children)
    public void countLeavesWithoutChildren() {
        int count = runToCheckWithoutChildren(root);
        System.out.println("Count of leaves without children is " + count);
    }

    private int runToCheckWithoutChildren(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.getLeft() == null && root.getRight() == null) {
            count++;
        }
        count += runToCheckWithoutChildren(root.getLeft());
        count += runToCheckWithoutChildren(root.getRight());
        return count;
    }

    // Count all nodes
    public void countLeaves() {
        int count = runLeaves(root);
        System.out.println("Count total is " + count);
    }

    private int runLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += runLeaves(root.getLeft());
        count += runLeaves(root.getRight());
        return count;
    }
}
