package NumberPatterns;

import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
        System.out.print(i + " ");
        System.out.print(i + 1);

        System.out.println();

        }
    
    }
}
