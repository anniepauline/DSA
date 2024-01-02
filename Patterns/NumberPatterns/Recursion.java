package NumberPatterns;

public class Recursion {
    static public void print_num(int num) {
        if (num == 0) {
            return;
        }
        print_num(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 5;
        print_num(num);
    }
}
