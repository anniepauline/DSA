package StringPatterns;

public class Palindrome {
    public static void main(String[] args) {
        {
            String s = "madam";
            int lastIndex = s.length() - 1;
            int startIndex = 0;
            while (lastIndex > startIndex) {
                if (s.charAt(startIndex) == s.charAt(lastIndex)) {
                    startIndex++;
                    lastIndex--;
                } else {
                    System.out.println("Not a palindrome");
                    return;
                }
            }
            System.out.println("Is a palindrome");
        }
    }
}
