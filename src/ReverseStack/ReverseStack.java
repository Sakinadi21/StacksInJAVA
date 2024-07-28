package ReverseStack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        Stack<Integer> rt = new Stack<>();

        // Transfer elements from st to rt to reverse the order
        while (st.size() > 0) {
            rt.push(st.pop());
        }

        System.out.println("Reversed Stack: " + rt);

        // Transfer elements back from rt to st to restore the original order
        while (rt.size() > 0) {
            st.push(rt.pop());
        }

        System.out.println("Restored Original Stack: " + st);
    }
}
