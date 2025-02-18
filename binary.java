class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Method to insert a new node
    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);  // If node is null, return a new node
        }
        if (data < node.data) {
            node.left = insert(node.left, data);  // Insert data in the left subtree
        } else if (data > node.data) {
            node.right = insert(node.right, data);  // Insert data in the right subtree
        }
        return node;
    }

    // Inorder traversal
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Preorder traversal
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Postorder traversal
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Search for a node with a specific value
    Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;  // Node found or root is null
        }
        if (root.data < key) {
            return search(root.right, key);  // Search in the right subtree
        }
        return search(root.left, key);  // Search in the left subtree
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder traversal of the tree");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder traversal of the tree");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder traversal of the tree");
        tree.postorderTraversal(tree.root);

        System.out.println("\nSearch for node with value 40:");
        Node result = tree.search(tree.root, 40);
        if (result != null) {
            System.out.println("Node found: " + result.data);
        } else {
            System.out.println("Node not found");
        }
    }
}
