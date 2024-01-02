package NumberPatterns;

public class Amstrong {
    public static int amstrong(int num) {

        int n = num;
        int count = 0;
        int rem;
        int res = 0;
        int output = 0;

        while (num > 0) {
            rem = num % 10;
            res = (res * 10) + rem;
            num = num / 10;
            count++;
        }
        num = n;
        while (num > 0) {
            rem = num % 10;
            output += Math.pow(rem, count);

            res = (res * 10) + rem;
            num = num / 10;
        }

        return output;

    }

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (i == amstrong(i))
                System.out.println(amstrong(i));
        }
    }
}
