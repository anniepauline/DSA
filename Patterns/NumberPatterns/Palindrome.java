package NumberPatterns;

public class Palindrome {
    static int res = 0;

    // functional
    // static int reverse(int num) {

    // while (num > 0) {
    // int rem = num % 10;// last element
    // res = (res * 10) + rem;

    // num /= 10;// remove last element
    // }
    // return res;
    // }

    // recursive
    static int reverse(int num) {
        if (num <= 0) {
            return res;
        }
        int rem = num % 10;// last element
        res = (res * 10) + rem;

        num /= 10;// remove last element
        return reverse(num);
    }

    public static void main(String[] args) {
        // int result = 0;
        int num = 12321;
        // int temp = num;

        int num1 = reverse(num);
        if (num == num1) {
            System.out.println("Its a plndrome!");
        } else {
            System.out.println("Its not a plndrome!");
        }
        // OR iterative
        // while (num > 0) {
        // int rem = num % 10;// last element
        // result = (result * 10) + rem;

        // num /= 10;// remove last element
        // }
        // if (temp == result) {
        // System.out.println("palimdrome");
        // } else {
        // System.out.println("not palimdrome");
        // }

        // }

    }
}
