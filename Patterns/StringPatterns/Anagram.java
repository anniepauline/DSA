package StringPatterns;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] s3 = new char[s1.length()];
        char[] s4 = new char[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            s3[i] = s1.charAt(i);
            s4[i] = s2.charAt(i);
        }
        if (s1.length() != s2.length()) {
            System.out.println("String is not an anagram!");

        }
        Arrays.sort(s3);
        Arrays.sort(s4);

        for (int i = 0; i < s3.length; i++) {
            if (s3[i] != s4[i]) {
                System.out.println("String is not an anagram!");
                return;
            }
        }

        System.out.println("String is an anagram!");

    }
}
