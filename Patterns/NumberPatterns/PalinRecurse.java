package NumberPatterns;

public class PalinRecurse {

    static int palindrome(int num, int res) {
        if (num == 0) {
            return res;
        }

        return palindrome(num / 10, (res * 10) + num % 10);
    }

    public static void main(String[] args) {
        int num = 12321;
        int res = 0;
        int ans = palindrome(num, res);
        System.out.println((num == ans) ? "Is palindrome" : "not palindrome");
    }
}
