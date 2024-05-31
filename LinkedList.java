package DSA_Individual2;
/*
* code defines a LinkedList class that represents a singly-linked list data structure. The class includes the following methods:

insertAtPos(int pos, int data):
Inserts a new node with the given data at the specified position in the linked list.
If the position is 1, the new node becomes the new head of the list.
Otherwise, it traverses the list to the specified position and inserts the new node.
deleteAtPosition(int pos):
Deletes the node at the specified position in the linked list.
If the position is 1, the head pointer is updated to the next node.
Otherwise, it traverses the list to the position before the one to be deleted and updates the next pointer.
deleteAfterNode(Node node):
Deletes the node that occurs after the given node in the linked list.
If the given node is null or the next node is null, the method returns without doing anything.
Otherwise, it updates the next pointer of the given node to skip the next node.
searchNode(int value):
Searches for a node with the given value in the linked list.
It traverses the list, checking the data of each node, and returns the node if found.
If the node is not found, it returns null.
printList(Node head):
Prints the values of all the nodes in the linked list, starting from the given head node.
It traverses the list and prints the data of each node.
*/
public class LinkedList {
    Node head;

    public void insertAtPos(int pos, int data) {

         // Inserts a new node with the given data at the specified position in the linked list
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos - 2; i++) {
            if (curr == null) {
                return;
            }
            curr = curr.next;
        }

        if (curr == null) {
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtPosition(int pos) {
        /**
         * Deletes the node at the specified position in the linked list.
         */
        if (head == null) {
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos - 2; i++) {
            if (curr == null || curr.next == null) {
                return;
            }
            curr = curr.next;
        }

        if (curr.next == null) {
            return;
        }

        curr.next = curr.next.next;
    }

    public void deleteAfterNode(Node node) {

         //Deletes the node that occurs after the given node in the linked list.

        if (node == null || node.next == null) {
            return;
        }

        node.next = node.next.next;
    }

    public Node searchNode(int value) {

         // Searches for a node with the given value in the linked list.
         // Returns the node if found, otherwise returns null.

        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.data == value) {
                System.out.println("The element is found at index of "+count+" with reference of "+curr);
                return curr;
            }
            count++;
            curr = curr.next;
        }
        return null;
    }
    //LinkedList list = new LinkedList();
    public  void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

