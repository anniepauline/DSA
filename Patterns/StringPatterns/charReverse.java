package StringPatterns;

public class charReverse {
    // A B D E F
    // G F E C B

    public static void main(String[] args) {
        String c1 = "ABDEF";
        // String c2 = "GFECB";
        System.out.println(c1);
        char[] asciToChar = new char[c1.length()];
        for (int i = 0; i < c1.length(); i++) {
            asciToChar[i] = (char) (c1.charAt(i) + 1);
        }
        for (int i = c1.length() - 1; i >= 0; i--) {
            System.out.print(asciToChar[i]);
        }
    }
}
