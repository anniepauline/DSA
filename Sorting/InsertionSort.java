//twice as fast of selection sort
//best case - 0(n)
//worst case - O(n²)


class Insertion{
    public static void sort(int[] a)
    {
        for(int i = 1 ;i < a.length;i++)
        {
            int value = a[i];
            int hole = i;

            while(hole >=0 && a[hole-1] > value)
            {
             a[hole] = a[hole-1];
             hole--;
            }
            a[hole] = value;
        }
    }
    public static void print(int[] a)
    {
        for(int i = 0 ;i < a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
public class InsertionSort {
 public static void main(String[] a)
 {
    int arr[] = {23,43,56,78};
    Insertion.sort(arr);
    Insertion.print(arr);
 }   
}
