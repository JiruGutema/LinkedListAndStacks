package DSA_Individual2;
import java.util.Scanner;

/*
 * main() method:
 * Calls the stacks() method, which tests the functionality of the Stack class.
 * linked() method:
 * Creates a new LinkedList object.
 * Inserts nodes with values 10, 20, 30, and 15 at specific positions.
 * Prints the linked list.
 * Searches for the node with value 20.
 * Deletes the node at position 2.
 * Prints the linked list after deletion.
 * Deletes the node after the node with value 30.
 * Prints the linked list after the second deletion.
 * stacks() method:
 * Creates a new Stack object.
 * Pushes the values 10, 20, and 30 onto the stack.
 * Prints the elements of the stack.
 * Prints the top element of the stack using peek().
 * Pops an element from the stack and prints it.
 * Prints the remaining elements of the stack.
 */

public class Main {

   public static void main(String[] args) {
       // calling the methods linked and stacks in the main class.
//        linked();
        stacks();
   }




   public static void linked () {
           Scanner scanner = new Scanner(System.in);
           LinkedList list = new LinkedList();
           list = new LinkedList();
           list.insertAtPos(1, 10);
           list.insertAtPos(2, 20);
           list.insertAtPos(3, 30); // inserting the values into the linked lists
           list.insertAtPos(4, 15);
           System.out.println("Linked List: "); // Output: Linked List: 10 15 20 30
           list.printList(list.head);
            System.out.println("Search node (value 20)");
            list.searchNode(20); // searches for the nodes that contains 20 as node.value

           list.deleteAtPosition(2); // deletes the values of the given nodes at specified node
           System.out.println("Linked List after deletion (at position 2): "); // Output: Linked List after deletion: 10 20 30
           list.printList(list.head); // prints out the linked lists
            System.out.println("deleting after next node (node of 30) "+list.head.next);
           list.deleteAfterNode(list.head.next); //inserting the node 2 step away from the head node.
            System.out.println("After deletion:");
            list.printList(list.head);



       }

   public static void stacks () {


       Stack stack = new Stack(); // creating new objects of the of the class stack
       stack.push(10);
       stack.push(20);
       stack.push(30);
       System.out.println("Elements of the stacks: ");
       stack.printStack(stack);

       System.out.println("Top element: ");
       System.out.println(stack.peek());
       System.out.println("Popped element: ");
       System.out.println(stack.pop());
       System.out.println("elements after popped: ");
       stack.printStack(stack);

           }
       }
