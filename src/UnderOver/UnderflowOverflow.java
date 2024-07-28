
    package UnderOver;

import java.util.Stack;

    public class UnderflowOverflow {
        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();

            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);

            System.out.println("Stack after pushes: " + st);

            while (!st.isEmpty()) {
                st.pop();
                System.out.println("Stack after pop: " + st);
            }

            // Attempting one more pop to demonstrate underflow
            try {
                st.pop();
            } catch (java.util.EmptyStackException e) {
                System.out.println("Stack underflow: no elements to pop");
            }



   System.out.println(st);
   st.pop();
   System.out.println(st);
   st.pop();
   System.out.println(st);
   st.pop();
   System.out.println(st);
   st.pop();
   System.out.println(st);
   st.pop();




}}
