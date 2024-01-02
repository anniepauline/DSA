package StringPatterns;

import java.util.ArrayList;
import java.util.List;

public class words {
    static void reverseWord(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.print(" ");

    }

    public static void main(String[] args) {
        String s = "apple is red ";
        // red is apple
        // elppa si der - done
        // Red3 Is2 Apple5
        // Elppa Si Der

        char[] c1;
        char[] c2;
        char[] c3;
        // String word = "";
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == 32) {

        // reverseWord(word);
        // word = "";
        // } else {
        // word += s.charAt(i);
        // }
        // }
        List<String> words = new ArrayList();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                words.add(word);
                word = "";
            } else {
                word += s.charAt(i);
            }
        }

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.size() - i);
            // System.out.println(words.get((words.size() - i)));
            // System.out.println(words.get((words.size()-1) -i));
        }
    }

}
