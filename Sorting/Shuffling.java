//Shuffling 
//Create a random index from k =0-i
// swap(i,k)
//O(n)

import java.lang.Math;

public class Shuffling {
    public static void main(String[] a)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Before shuffling");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
        for(int i = 0;i < arr.length;i++)
        {
            int k = (int)Math.random()*i;
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        System.out.println(" ");
        System.out.println("After Shuffling:");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }
}
