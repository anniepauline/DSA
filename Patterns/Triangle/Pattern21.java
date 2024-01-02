package Triangle;

public class Pattern21 {

    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        // for (int k = 5 - i; k >= 0; k--) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j <= i; j++) {

        // System.out.print(j + " ");
        // }
        // for (int k = i - 1; k >= 0; k--) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // }
        for (int i = 5; i >= 0; i++) {
            for (int k = 5 - i; k >= 0; k--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
