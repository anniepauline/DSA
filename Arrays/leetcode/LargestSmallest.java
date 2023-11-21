//Find Second Smallest and Second Largest Element in an array

class LargestSmallest {
    public static void main(String... args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // second min
        int minner = min;
        // second max
        int maxxer = max;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            // update 2nd min
            if (arr[i] > maxxer && arr[i] != max) {
                maxxer = arr[i];
            }
            // update 2nd max
            if (arr[i] < minner && arr[i] != min) {
                minner = arr[i];
            }
        }

        System.out.println(minner + " " + maxxer);

    }
}