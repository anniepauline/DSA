import java.util.Scanner;

public class nOccurance {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 11, 13, 9, 11, 12, 11, 14 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer to search:");
        int n = sc.nextInt();
        System.out.println("Enter the occurance:");
        int occ = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
                if (count == occ) {
                    System.out.println(i);
                }
            }
        }

    }
}
