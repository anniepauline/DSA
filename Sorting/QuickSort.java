//all elements to the left of pIndex is smaller
//and right of pindex is greater
//best - O(n log n) 
//worst- O(n²) 


import java.lang.Math;

public class QuickSort {

    int partition(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        int pIndex = start;

        for(int i=start;i<end;i++)
        {
        //when a[i] < pivot, move elements to the left of pIndex
        //by swap(a[i] and pIndex) pIndex++
            if(arr[i] <= pivot)
            {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex]=temp;
                pIndex++;
            }
        }
        //swap pindex and pivot element
            int temp = arr[pIndex];
            arr[pIndex] = arr[end];
            arr[end] = temp;
            return pIndex;
    }

    void sort(int[] a, int start, int end)
    {
        if(start < end)
        {
            int partitionIndex = partition(a,start,end);
            sort(a,start,partitionIndex-1);
            sort(a,partitionIndex+1,end);
        }
    }
    public static void main(String[] args)
    {
        int[] a = {3,2,4,1,5,6};
        System.out.println("Before sort: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
         System.out.println("");
        //shuffling
        for(int i =0;i<a.length;i++)
        {
            int k = (int) Math.random()*i;
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
        QuickSort obj = new QuickSort();
        obj.sort(a, 0, a.length-1);

        System.out.println("After sort: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
