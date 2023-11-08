//reverse each word in a sentence

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String s = "Sky is blue";

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                st.add(s.charAt(i));
            } else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.println(" ");
            }
        }
        // for the last word
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }
}
