package NumberPatterns;

public class Sum {
    public static void main(String[] args) {

        int arr[] = { 10, 5, 15, 20, 14, 13, 9 };
        int sum;
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + arr[i + 1];
            if (sum > max) {
                max = Math.max(max, sum);
                index = i;
            }
        }
        System.out.print(max);
        System.out.println(" " + arr[index] + " " + arr[index + 1]);
    }

}
