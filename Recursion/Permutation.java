//find the permutatio of a given string O()

public class Permutation {

    public static void permute(char[] arr, int fi)
    {
        if( fi == arr.length)
        {
            System.out.println(arr);
            return;
        }
        for(int i = fi; i < arr.length;i++)
        {
            swap(arr,i,fi);
            permute(arr, fi+1);
            swap(arr,i,fi);
        }
    }
    public static void swap(char[]arr , int i, int fi)
    {
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
    public static void main(String a[])
    {
        char str[] = {'a','b','c','d'};
        permute(str,0);
    }
}
