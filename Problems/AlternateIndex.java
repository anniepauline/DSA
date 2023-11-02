//Merge 2 array's in alternative index
class AlternateIndex {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6, 8, 10, 12, 14 };

        int len1 = arr1.length;
        int len2 = arr2.length;

        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        while (i < len1 && j < len2) {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }

        while (i < len1) {
            arr3[k++] = arr1[i++];
        }
        while (j < len2) {
            arr3[k++] = arr2[j++];
        }

        for (int n : arr3) {
            System.out.print(n + " ");
        }
    }
}