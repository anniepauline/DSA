//O(n) = log n

public class binarySearch {
    public static int binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 12, 14, 16, 18, 20, 24, 27 };
        int key = 16;
        int index = binarySearch(arr, key);
        System.out.println(index + 1);
    }
}
