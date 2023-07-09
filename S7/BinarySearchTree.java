package S7;

public class BinarySearchTree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    BinarySearchTree(int n) {
        this.root = new Node(n);
    }

    //Insert a new node with data of n to a BST
    public void insertNode(Node curNode, int n) {
        Node newNode = new Node(n);
        if (curNode.data < n) {
            if (curNode.right == null) {
                curNode.right = newNode;
            } else {
                insertNode(curNode.right, n);
            }
        } else if (curNode.data > n) {
            if (curNode.left == null) {
                curNode.left = newNode;
            } else {
                insertNode(curNode.left, n);
            }
        }
    }

    //Remove the node with data of n in a BST
    public void removeNode(Node curNode, int n) {
        //if delete node doesn't exist
        if(curNode == null){
            return;
        }
        if (curNode.data < n) {
            removeNode(curNode.right, n);
            return;
        } else if (curNode.data > n) {
            removeNode(curNode.left, n);
            return;
        }
        // The node with data of n has been found.
        if(curNode.left == null && curNode.right == null){
            curNode = null;
        }
        // Case 2: the found node has a single child sub-tree
        else if (curNode.left == null) {
            curNode = curNode.right;
        } 
        else if (curNode.right == null) {
            curNode = curNode.left;
        }
        // Case 3: the found node has two children sub-trees.
        else {
            // Find the min node MIN_RIGHT_NODE in the right sub-tree
            Node minRightNode = findMinNode(curNode.right);
            // Replace data of the current node with the data of MIN_RIGHT_NODE
            curNode.data = minRightNode.data;
            // Delete the min node MIN_RIGHT_NODE in the right sub-tree
            removeNode(curNode.right, minRightNode.data);
        }
    }

    //find the MIN_NODE of a BST
    public Node findMinNode(Node curNode){
        if(curNode == null){
            return curNode;
        }
        if(curNode.left != null){
            return findMinNode(curNode.left);
        } else {
            return curNode;
        }
        
    }
    
    public int[] retrieveAllNodesByPostOrderTraverse() {
        // TODO
        // https://www.geeksforgeeks.org/binary-search-tree-traversal-inorder-preorder-post-order/
        int[] arr = {};
        return arr;
    }

    public int[] retrieveAllNodesByPreOrderTraverse() {
        // TODO
        // https://www.geeksforgeeks.org/binary-search-tree-traversal-inorder-preorder-post-order/
        int[] arr = {};
        return arr;
    }

    public int[] retrieveAllNodesByInOrderTraverse() {
        // TODO
        // https://www.geeksforgeeks.org/binary-search-tree-traversal-inorder-preorder-post-order/
        int[] arr = {};
        return arr;
    }

}
