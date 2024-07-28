package Brackets;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is an opening parenthesis '(', push it onto the stack
            if (ch == '(') {
                stack.push(ch);
            }
            // If the character is a closing parenthesis ')'
            else if (ch == ')') {
                // If the stack is empty and we encounter a closing parenthesis, it's unbalanced
                if (stack.isEmpty()) {
                    return false;
                } else {
                    // Pop the top of the stack which should be a matching opening parenthesis '('
                    stack.pop();
                }
            }
        }

        // After iterating through the string, if the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
