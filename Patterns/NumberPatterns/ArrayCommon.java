package NumberPatterns;

public class ArrayCommon {
    public static void main(String[] args) {
        int[] arr1 = { 10, 5, 15, 20, 14, 3, 9 };
        int[] arr2 = { 5, 9, 10, 15, 22, 24 };

        System.out.println("Common elements are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
