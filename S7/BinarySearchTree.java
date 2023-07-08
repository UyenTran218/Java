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

    public void removeNode(Node curNode, int n) {
        // TODO
        // https://www.geeksforgeeks.org/deletion-in-binary-search-tree/ 
        if(curNode.data < n){
            removeNode(curNode.right, n);
        } else if (curNode.data > n){
            removeNode(curNode.left, n);
        }
        else {
            if(curNode.left == null && curNode.right == null){
                
            }
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
