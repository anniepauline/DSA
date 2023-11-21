//Find Second Smallest and Second Largest Element in an array

class LargestSmallest {
    public static void main(String... args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // second min
        int s_min = min;
        // second max
        int s_max = max;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            // 2nd max != max and greater than maxxer
            if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i];
            }
            // 2nd min != min and lesser than minner
            if (arr[i] < s_min && arr[i] != min) {
                s_min = arr[i];
            }
        }
    }
}