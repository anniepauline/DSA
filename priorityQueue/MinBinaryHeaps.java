class Min{
    int capacity = 10;
    private Integer[] arr = new Integer[capacity];
    private int N;

    public void insert(int x)
    {
        if(N== capacity)
        {
            System.out.println("Overflow");
        }
        arr[++N] = x;
        swim(N);
    }
    public void deleteMin()
    {
        int min = arr[1];
        exch(min, N--);
        sink(1);
        arr[N+1] = null;
    }
    public void swim(int k)
    {
        //check if child is greater than parent, goes upward
        while(k > 1 && !(more(k,k/2)))
        {
            exch(k,k/2);
            k = k/2;
        }
    }
    public void sink(int k)
    {
     //check if parent is lesser than children, goes downward 
        while(2*k <= N )
        {
             int j = 2*k;
            if(j < N && more(j,j+1))
            {
               j++;
            }
            if(more(j,k))
            {
                break;
            }
            exch(j,k);
            k = j;
        }
    }
    public void exch(int i, int j)
    {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
    public boolean more(int i,int j)
    {
        if(arr[i] > arr[j]) return true;
        else return false;
    }
    public void print()
    {
        for(int i=1;i<capacity;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public void getMin()
    {
        System.out.println(arr[1]);
    }
}

public class MinBinaryHeaps {
    public static void main(String[] a)
    {
        Min obj=new Min();
        obj.insert(20);
        obj.insert(2);
        obj.insert(1);
        obj.insert(41);
        obj.insert(17);
        obj.insert(100);
        obj.deleteMin();
        //obj.getMin();
        obj.print();
    }
}
