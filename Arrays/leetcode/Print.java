import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse order");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
