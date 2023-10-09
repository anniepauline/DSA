//selection sort - sorts from left
//worst case - O(n²) - even if sorted
//best case O(n²)
//with static methods, we dont need to initialize objects

 class Selection{

    public static void sort(int[] a)
    {
       int size = a.length;
       int min;
       for(int i=0;i<size;i++)
       {
         min = i;
         for(int j=i+1;j<size;j++)
         {
            if(a[j] < a[min])
            {
                min = j; 
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
         }
       }
       System.out.println("Sorted elements: ");
       for(int i:a)
       {
        System.out.println(i);
       }
    }
    public static boolean isSorted(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
        if(a[i-1] > a[i])
        {
            return false;
        }
        }
        return true;
    }


}


public class SelectionSort {
    public static void main(String[] a)
    {
        int[] arr = {32, 12, 11,76,89};
        Selection.sort( arr);
        Selection.isSorted(arr);
    }
}
