package Subsequences;

import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the stack is empty or the current element is different from the top of the stack
            if (st.isEmpty() || arr[i] != st.peek()) {
                st.push(arr[i]);
            } else {
                // If the current element is equal to the top of the stack, skip consecutive duplicates
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
                st.pop(); // Remove the duplicate element from the stack
            }
        }

        // Convert the stack to an array
        int[] res = new int[st.size()];
        int idx = st.size() - 1;
        while (!st.isEmpty()) {
            res[idx--] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 7, 2};
        int[] res = remove(arr);

        // Print the result array
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
