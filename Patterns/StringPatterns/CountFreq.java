package StringPatterns;

public class CountFreq {
    public static void main(String[] args) {
        String s = "PE12n@# NG";
        int up = 0;
        int lc = 0;
        int space = 0;
        int sp = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            // isDidgit()
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                d++;
            } // isUpperCase()
            else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                up++;
            } // isLowerCase()
            else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                lc++;
            } // isSpaceChar()
            else if ((s.charAt(i) == 32)) {
                space++;
            } else {
                sp++;
            }
        }
        System.out.println("digits:" + d);
        System.out.println("lowercase:" + lc);
        System.out.println("uppercase:" + up);
        System.out.println("special chars:" + sp);
        System.out.println("space chars:" + space);
    }
}
