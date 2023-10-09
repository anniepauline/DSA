//element at the top ois the highest
//delete max
//sink - if child  > parent
//swim - parent < child
//log n
class Max{

    private int N;
    private int capacity = 6;
    private Integer[] arr = new Integer[capacity];
    
    public void insert(int x)
    {
        if(N == capacity)
        {
            System.out.println("Overflow");
            return;
        }
        arr[++N] = x;
        swim(N);
    }
    public int deleteMax()
    {
        int max = arr[1];
       //swap first and last element
        exch(1,N--);
        sink(1);
        arr[N+1] = (java.lang.Integer) null;
        return max;
    }
    public boolean less(int i,int j)
    {
        if(arr[i] < arr[j] )
        return true;
        else
        return false;
    }
    public void exch(int i,int j)
    {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
    public void sink(int k)
    {
        while(2*k <= N )
        {
            int j=2*k;
            if(j < N && less(j,j+1))
            {
               j++;
            }
            if(!less(k,j))
            {
                break;
            }
            exch(k,j);
            k=j;// check for the swapped element
        }
    }
    public void swim(int k)
    {
        while( k > 1 && less(k/2,k))
        {
            exch(k,k/2);
            k=k/2;//update k
        }
    }
    
    public void getMax()
    {
        System.out.println(arr[1]);
    }
    public void print()
    {
        for(int i=1;i<capacity;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}


public class MaxBinaryHeap {
    public static void main(String[] a)
    {
        Max obj = new Max();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(80);
        System.out.println(obj.deleteMax());
        System.out.println("Array elements are:");
        obj.print();
    }
}
