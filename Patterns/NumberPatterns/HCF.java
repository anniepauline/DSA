public class HCF {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(getHCF(a, b));

    }

    // static int getHCF(int a, int b) {
    // int hcf = 0;
    // int min = 0;
    // if (a < b) {
    // min = a;
    // } else {
    // min = b;
    // }
    // for (int i = 1; i <= min; i++) {
    // if ((a % i == 0) && (b % i == 0)) {
    // hcf = i;
    // }
    // }
    // return hcf;
    // }
    // static int getHCF(int a, int b) {
    // while (a != b) {
    // if (a > b) {
    // a = a - b;
    // } else {
    // b = b - a;
    // }
    // }
    // return a;
    // }

    // static int getHCF(int a, int b) {
    // while (a > 0 && b > 0) {
    // if (a > b) {
    // a = a - b;
    // } else {
    // b = b - a;
    // }
    // }
    // if (a != 0) {
    // return a;
    // } else
    // return b;

    // }

    // log(min(a,b))
    static int getHCF(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a != 0)
            return a;
        else
            return b;
    }
}
