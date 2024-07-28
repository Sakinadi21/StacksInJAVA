package insertionInStack;

import java.util.Stack;

public class insertionInStack
{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: " + st);

        int idx = 3; // Adjust the index to be within the range of the stack size
        int x = 12;
        Stack<Integer> temp = new Stack<>();

        // Ensure idx is a valid index within the stack
        if (idx >= 0 && idx <= st.size()) {
            while (st.size() > idx) {
                temp.push(st.pop());

            }
            st.push(x);
            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }
        } else {
            System.out.println("Index out of range");
        }

        System.out.println("Stack after insertion: " + st);
    }
}
