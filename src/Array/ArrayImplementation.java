package Array;

public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5]; // Array to hold stack elements
        private int idx = 0; // Index to track the current position in the stack

        void push(int x) {
            if (isFull()) { // Check if the stack is full
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x; // Add the new element to the stack
            idx++; // Increment the index
        }

        int peek() {
            if (idx == 0) { // Check if the stack is empty
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx - 1]; // Return the top element of the stack
        }

        int pop() {
            if (idx == 0) { // Check if the stack is empty
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx - 1]; // Get the top element of the stack
            arr[idx - 1] = 0; // Remove the top element from the stack
            idx--; // Decrement the index
            return top; // Return the removed element
        }

        void display() {
            for (int i = 0; i < idx; i++) { // Loop through the stack elements
                System.out.print(arr[i] + " "); // Print each element
            }
            System.out.println(); // Print a new line after displaying all elements
        }

        int size() {
            return idx; // Return the current size of the stack
        }

        boolean isEmpty() {
            return idx == 0; // Return true if the stack is empty, false otherwise
        }

        boolean isFull() {
            return idx == arr.length; // Return true if the stack is full, false otherwise
        }

        public static void main(String[] args) {
            Stack st = new Stack(); // Create a new stack
            st.push(4); // Push 4 onto the stack
            st.push(5); // Push 5 onto the stack
            st.push(1); // Push 1 onto the stack
            st.display(); // Display the current stack
            System.out.println(st.size()); // Print the size of the stack
            st.pop(); // Pop the top element from the stack
            st.display(); // Display the current stack
        }
    }
}
