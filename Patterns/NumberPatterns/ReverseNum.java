package NumberPatterns;

public class ReverseNum {
    public static void main(String[] args) {
        int result = 0;
        int num = 12345;
        while (num > 0) {
            int rem = num % 10;// last element
            result = (result * 10) + rem;

            num /= 10;// remove last element
        }
        System.out.println(result);
    }
}
