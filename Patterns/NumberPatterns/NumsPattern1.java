package NumberPatterns;

import java.util.Scanner;

public class NumsPattern1 {
    // static int sum = 0;

    static int reverse(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                while (true) {
                    int res = reverse(k);
                    if (res == k) {
                        System.out.print(res + " ");
                        k++;
                        break;
                    } else {
                        k++;
                    }
                }

            }
            System.out.println();
        }

        \yyyhhhhhh
    }
}
