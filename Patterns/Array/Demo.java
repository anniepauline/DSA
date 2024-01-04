import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter " + i + " row and " + j + " col value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // i==j
                // i+j==2 || i==j
                if (i + j == 2) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
