//Heap sort push elements to arr
//build heap using bottom up method(n/2 from r to l, sink)
//remove the max element one at a time and sink
//array is sorted 
//best - O(n logn), worst O(2n logn)

//array starts from 0 index
public class HeapSort {
    public  void exch(int[]a,int i,int j)
    {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    public  boolean less(int[]a, int i,int j)
    {
        if(a[i] < a[j])
        {
            return true;
        }
        else{
            return false;
        }
    }
    public  void sink(int[] a,int k,int N)
    {     
        while((2*k)+1 <= N)
        {           
            int j=2*k+1;//left index, j+1 is right index
            if(j < N && less(a,j,j+1))
            {
               j++;
            }
            if(!less(a,k,j))
            {
                break;
            }
            exch(a,k,j);
            k=j;// check for the swapped element          
        }       
    }
     public void print(int[] a)
        {
            for(int i :a)
            {
                System.out.print(i + " ");
            }
        }
    public static void main(String s[])
    {
        int[] a = {4,10,3,5,1};
        int N = a.length-1;
        HeapSort obj = new HeapSort();
       
        for(int k=(N/2)-1; k >= 0;k--)
        { 
            obj.sink(a,k,N);
        }    
        while(N > 0)
        {
            //removeMax()
            obj.exch(a,0,N);           
            obj.sink(a,0,--N);          
        }
        obj. print(a);      
    }
}
