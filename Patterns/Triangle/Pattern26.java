public class Pattern26 {
    public static void main(String[] args) {

        // 1
        // 2 4
        // 8 16 32
        // 64 128 .. ..
        // 8 16 32
        // 2 4
        // 1
        int k = 1;
        // for (int i = 0; i <= 4; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(k + " ");
        // k *= 2;
        // }
        // System.out.println();
        // }

        for (int i = 4; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k *= 2;
            }
            System.out.println();
        }

    }

}
