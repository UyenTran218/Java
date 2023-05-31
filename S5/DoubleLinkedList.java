package S5;

import java.util.*;

/**
 * DoubleLinkedList
 */
public class DoubleLinkedList {

    Node head;

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int d){data = d;}
       
    }
    


    /** 
     * 
     * Add new node into the tail of the list
     */
    void append(int nodeData) {
        Node new_node = new Node(nodeData);
        if(head == null){
            head = new_node;
            return;
        }
        new_node.next = null;
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        n.next = new_node;
        new_node.previous = n;
        return;
    }

    // TODO
    /**
     * Delete a node from the list, whose value is equal to the input param `nodeData`.
     */
    void delete(int nodeData) {
        if(head == null){
            return;
        } else {
            if(find(nodeData) != null){
                Node delete_node = find(nodeData);
                
            }
        }
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
     * TODO
     * 
     * return a node whose value is equal to the input param `nodeData`.
     */
    Node find(int nodeData) {
        if(head.data == nodeData){
            return head;
        } else {
            Node n = head;
            while(n.next != null){
                if(n.data == nodeData){
                    return n;
                }
            }
        }
        return null;
    }

    Node find(Node curNode, int nodeData){
        if (curNode == null) {
            return null;
        }

        if (curNode.data == nodeData) {
            return curNode;
        }else {
            return find(curNode.next, nodeData);
        }
    }

    /** TODO
     * Find the node with the largest value from the list
     */
    Node findMaxNode() {
        
        return null;
    }

    /** TODO
     * Sort the list such that the head node has the smallest value.
     */
    void sort() {
        
    }

    /** TODO
     * Add new node into the list in the sorted order.
     */
    void insertInSortedOrder(Node n){

    }
    
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.append(190);
        dll.append(110);
        dll.append(145);

        dll.printList();
        Node node_66 = dll.find(dll.head, 66);

    }

    
}