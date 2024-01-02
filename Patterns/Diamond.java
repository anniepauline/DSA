public class Diamond {
    public static void main(String[] s) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            // spacing
            for (int k = n - i; k > 0; k--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower diamond
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = (n * 2) - ((2 * i) - 1); j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
