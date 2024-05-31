package DSA_Individual2;
/**
 * Class: Stack
 * This class implements a stack data structure using a singly-linked list.
 *
 * Member Variables:
 *
 * head: The head of the linked list that represents the stack.
 * Constructor:
 *
 * Stack(): Initializes the head of the linked list to null.
 * Methods:
 *
 * push(int data):
 * Creates a new Node with the given data.
 * If the stack is empty (i.e., head is null), the new node becomes the head.
 * Otherwise, it traverses to the end of the linked list and adds the new node at the end.
 * pop():
 * If the stack is empty, returns -1.
 * If the stack has only one element, it removes the head and returns the element.
 * Otherwise, it traverses to the second-to-last element, removes the last element, and returns its value.
 * peek():
 * If the stack is empty, returns -1.
 * If the stack has only one element, it returns the value of the head.
 * Otherwise, it traverses to the second-to-last element and returns the value of the last element.
 * isEmpty():
 * Returns true if the stack is empty (i.e., head is null), false otherwise.
 * printStack(Stack stack):
 * Prints the elements of the stack from top to bottom.
 * If the stack is empty, it prints "The stack is empty!".
 * Restores the original state of the stack after printing.*/

public class Stack {
    private  static Node head; // Head of the linked list

    public Stack() {
        head = null;
    }

    public void push(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // Make the new node the new head of the list

        if(head == null){
            head = newNode;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;

    }

    public int pop() {
        Node node;
        // If the stack is empty, return -1
        if (head == null) {
            return -1;
        }
        else if (head.next == null) {
            int Ele = head.data;
            head = null;
            return Ele;
        }
        Node current = head;
        while(current.next.next !=null){
            current = current.next;
        }

        int data = current.next.data;
        current.next = null;
        return data;
    }

    public int peek() {
        Node node;
        // If the stack is empty, return -1
        if (head == null) {
            return -1;
        }
        else if (head.next == null) {
            return head.data;
        }
        Node current = head;
        while(current.next.next !=null){
            current = current.next;
        }

        int data = current.next.data;
        return data;
    }


    public boolean isEmpty() {
        return (head == null);
    }

    public static void printStack(Stack stack) {
        Node current = head;

        if(head == null){
            System.out.println("The stack is empty!");
            return;
        }
        while(current.next !=null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);

        // Restore the original stack

        }


}