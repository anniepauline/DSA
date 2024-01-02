package NumberPatterns;

public class Fibonacci {
    static int fib(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(num1);

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        fib(n);
    }
}
