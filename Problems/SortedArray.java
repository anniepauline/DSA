public class SortedArray {
    public static void main(String[] args) {
        SortedArray a = new SortedArray();
        int arr[] = { 1, 2, 3, 4, 5 };
        if (isSorted(5, arr) == 1) {
            System.out.println("Array is sorted");
        }
    }

    public static int isSorted(int n, int[] a) {
        // Write your code here.
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
        }
        return 1;
    }
}
