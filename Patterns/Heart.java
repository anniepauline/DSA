class Heart {
    public static void main(String[] args) {
        int row = 6;
        int col = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if ((i == 1 && (j % 3 == 0)) || (i == 0 && (j % 3 != 0)) || (i - j == 2) || (i + j) == 8) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}