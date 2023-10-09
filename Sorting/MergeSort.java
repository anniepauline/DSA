//using recursion
//divide the arr into 2 = sort()
//join the 2 arrays in asc order - merge()
//recursion uses more memory and is not inplace
//time Best - O(n log n) Worst - O(n log n)
//space O(nlogn) 
public class MergeSort {

    void merge(int[]A, int[] left,int[] right)
    {
        int leftLen = left.length;
        int rightLen = right.length;
        int i =0;int j=0;int k=0;

        while(i<leftLen && j < rightLen)
        {
            if(left[i] < right[j])
            {
                A[k] = left[i];
                i++;
            }
            else{
                A[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < leftLen)
     {
            A[k] = left[i];
            i++; k++;
        }
        while(j<rightLen)
        {
            A[k] = right[j];
            j++;k++;
        }
       
    }

    void sort(int[] a)
    {   
        if(a.length < 2) return;
        int mid = a.length/2;

        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

    
        for(int i=0;i<left.length;i++)
        {
            left[i] = a[i];
        }
       
        for(int i =mid; i < a.length;i++)
        {
            right[i-mid] = a[i];
        }
        
        sort(left);
        sort(right);
        merge(a,left,right);
    }

     void print(int a[])
     {
        System.out.println("Sorted array:");
        for(int i : a)
        {
            System.out.print(i + " ");
        }
     }

  public static void main(String[] args)
  {
    int arr[] = {12, 11, 13, 5, 6, 7};
    System.out.println("Given array:");
    for(int i : arr)
    {
        System.out.print(i + " ");
    }
    System.out.println("");
        MergeSort obj = new MergeSort();
        obj.sort(arr);
        obj.print(arr);
  } 

}
