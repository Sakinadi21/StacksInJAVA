package display;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> rt = new Stack<>();
        // Transfer elements from st to rt to reverse the order
        while (st.size() > 0) {
            rt.push(st.pop());
        }

        // Print elements from rt and push them back to st to preserve the original stack
        while (rt.size() > 0) {
            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x);
        }

        // Verify that st is back to its original state (optional)
        System.out.println("\nOriginal stack restored: " + st);

        /*   int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i<n;i++){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);*/
    }
}
