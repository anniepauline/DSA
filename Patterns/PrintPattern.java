class PrintPattern {
    public static void main(String s[]) {
        // for (int i = 0; i <5; i++) {
        // for (int j = i; j < i + 5; j++) {
        // System.out.print(" " + j);
        // }
        // System.out.println(" ");
        // }
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  " + k++);
            }
            System.out.println(" ");
        }
    }
}

// 5 4 3 2 1
// 10 9 8 7 6
// 15 14 13 12 11
// 20 19 18 17 16
// 25 24 23 22 21