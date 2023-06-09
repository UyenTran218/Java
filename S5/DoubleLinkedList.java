package S5;

/**
 * DoubleLinkedList
 */
public class DoubleLinkedList {

    Node head;

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int d) {
            data = d;
            next = previous = null;
        }

    }

    /**
     * 
     * Add new node into the tail of the list
     */
    void append(int nodeData) {
        Node new_node = new Node(nodeData);
        if (head == null) {
            new_node.previous = null;
            head = new_node;
            return;
        }
        new_node.next = null;

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new_node;
        new_node.previous = n;

    }

    /**
     * Delete a node from the list, whose value is equal to the input param
     * `nodeData`.
     */
    void delete(int nodeData) {
        Node delete_node = find(nodeData);
        if (head == null || delete_node == null) {
            return;
        }
        if (delete_node == head) {
            head = delete_node.next;
        }
        if (delete_node.next != null) {
            delete_node.next.previous = delete_node.previous;
        }
        if (delete_node.previous != null) {
            delete_node.previous.next = delete_node.next;
        }
        return;

    }

    /**
     * 
     * Print out value of all nodes in the list, starting from head node.
     */
    public void printList() {
        Node curNode = this.head;
        while (curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }

    /**
     * 
     * return a node whose value is equal to the input param `nodeData`.
     */
    Node find(int nodeData) {

        if (head.data == nodeData) {
            System.out.println(head.data);
            return head;
        } else {
            Node n = head;
            while (n.next != null && n.data != nodeData) {
                n = n.next;
            }
            if (n.data == nodeData) {
                System.out.println(n.data);
                return n;
            }
        }
        return null;
    }

    Node find(Node curNode, int nodeData) {
        if (curNode == null) {
            return null;
        }

        if (curNode.data == nodeData) {
            return curNode;
        } else {
            return find(curNode.next, nodeData);
        }
    }

    /**
     * Find the node with the largest value from the list
     */
    Node findMaxNode() {
        if (head == null) {
            return null;
        }
        Node maxNode = this.head;
        Node tmp = this.head;

        while (tmp != null) {
            if (tmp.data > maxNode.data) {
                maxNode = tmp;
            }
            tmp = tmp.next;
        }
        return maxNode;

    }

    /**
     * Sort the list such that the head node has the smallest value.
     */
    void sort() {
        if (head == null || head.next == null) {
            return;
        }
        Node curr = head;
        Node indexNode = head.next;
        int tmp;

        while (indexNode != null) {
            if (curr.data > indexNode.data) {
                tmp = curr.data;
                curr.data = indexNode.data;
                indexNode.data = tmp;
            }
            indexNode = indexNode.next;
        }
    }

    /**
     * Add new node into the list in the sorted order.
     */
    void insertInSortedOrder(int nodeData) {
        sort();
        Node n = new Node(nodeData);
        if (head == null) {
            head = n;
        } else if (head.data >= nodeData) {
            n.next = head;
            head = n;
        } else {
            Node curr = head;
            while (curr.next != null && curr.next.data < nodeData) {
                curr = curr.next;
            }
            n.next = curr.next;
            if (curr.next != null) {
                n.next.previous = n;
            }
            curr.next = n;
            n.previous = curr;
        }

    }

    /**
     * Function to find the middle node of a double link list
     * using the turtle and the hare approach
     */
    Node findMidNode(Node h) {
        Node fast, slow;
        fast = h;
        slow = h;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void sortByMerge() {
        head = mergeSort(this.head);
    }

    /*
     * Sort the list in increasing order using merge sort
     */
    private Node mergeSort(Node n) {
        if (n == null || n.next == null) {
            return n;
        }
        Node mid = findMidNode(n);
        Node head2 = mid.next;
        mid.next = null;
        head2.previous = null;

        Node leftHead = mergeSort(n);
        Node rightHead = mergeSort(head2);

        return merge(leftHead, rightHead);
    }

    /*
     * Function to merge 2 double linked lists
     */
    Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.data <= head2.data) {
            // System.out.println("head 1: " + head1.data);
            head1.next = merge(head1.next, head2);
            head1.next.previous = head1;
            head1.previous = null;
            return head1;
        } else {
            // System.out.println("head 2: " + head2.data);
            head2.next = merge(head1, head2.next);
            head2.next.previous = head2;
            head2.previous = null;
            return head2;
        }

    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.append(120);
        dll.append(110);
        dll.append(150);
        dll.append(145);
        dll.append(145);

        DoubleLinkedList dll2 = new DoubleLinkedList();

        dll2.append(90);
        dll2.append(123);
        dll2.append(167);
        dll2.append(180);

        // dll.printList();
        // dll.find(145);
        // dll.delete(66);
        // dll.printList();
        // System.out.println(dll.findMaxNode().data);
        // dll.sort();

        // dll.insertInSortedOrder(170);
        // dll.insertInSortedOrder(195);
        // System.out.println(dll.findMidNode(head).data);
        dll.sortByMerge();
        // dll.head = dll.merge(dll.head, dll2.head);
        dll.printList();
    }

}