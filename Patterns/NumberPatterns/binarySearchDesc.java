public class binarySearchDesc {
    public static int binarySearch(int arr[], int x) {
        int low = 0;
        
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 27, 24, 20, 18, 16, 14, 8, 4, 3, 1 };

        int key = 1;
        int index = binarySearch(arr, key);
        System.out.println(index + 1);
    }
}
