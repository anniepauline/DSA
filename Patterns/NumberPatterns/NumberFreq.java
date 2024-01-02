package NumberPatterns;

import java.util.Scanner;

public class NumberFreq {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 11, 13, 9, 11, 12, 11, 14 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer to search:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        System.out.println("Frequency of " + n + " is " + count);
    }
}