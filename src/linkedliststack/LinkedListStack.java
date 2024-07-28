package linkedliststack;
public class LinkedListStack {
        // Node class to represent each element in the stack
        private static class Node {
            int data; // Data stored in the node
            Node next; // Reference to the next node

            // Node constructor to initialize the node with data
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top; // Reference to the top node in the stack

        // Constructor to initialize an empty stack
        public LinkedListStack() {
            this.top = null;
        }

        // Method to push an element onto the stack
        public void push(int x) {
            Node newNode = new Node(x); // Create a new node with the given data
            newNode.next = top; // Link the new node to the current top node
            top = newNode; // Update the top reference to the new node
        }

        // Method to peek at the top element of the stack without removing it
        public int peek() {
            if (top == null) { // Check if the stack is empty
                System.out.println("Stack is Empty!");
                return -1;
            }
            return top.data; // Return the data of the top node
        }

        // Method to pop the top element from the stack
        public int pop() {
            if (top == null) { // Check if the stack is empty
                System.out.println("Stack is Empty!");
                return -1;
            }
            int topData = top.data; // Store the data of the top node
            top = top.next; // Update the top reference to the next node
            return topData; // Return the data of the removed node
        }

        // Method to display all elements in the stack
        public void display() {
            Node current = top; // Start from the top node
            while (current != null) { // Traverse the stack until the end
                System.out.print(current.data + " "); // Print the data of each node
                current = current.next; // Move to the next node
            }
            System.out.println(); // Print a new line after displaying all elements
        }

        // Method to get the current size of the stack
        public int size() {
            int count = 0; // Initialize a counter
            Node current = top; // Start from the top node
            while (current != null) { // Traverse the stack until the end
                count++; // Increment the counter for each node
                current = current.next; // Move to the next node
            }
            return count; // Return the total count
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return top == null; // Return true if the top is null, false otherwise
        }

        public static void main(String[] args) {
            LinkedListStack stack = new LinkedListStack(); // Create a new stack
            stack.push(4); // Push 4 onto the stack
            stack.push(5); // Push 5 onto the stack
            stack.push(1); // Push 1 onto the stack
            stack.display(); // Display the current stack
            System.out.println("Size: " + stack.size()); // Print the size of the stack
            System.out.println("Top element: " + stack.peek()); // Peek at the top element
            stack.pop(); // Pop the top element from the stack
            stack.display(); // Display the current stack
            System.out.println("Size: " + stack.size()); // Print the size of the stack
            System.out.println("Top element: " + stack.peek()); // Peek at the top element
        }
    }


