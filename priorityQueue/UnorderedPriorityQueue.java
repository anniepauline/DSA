//same as queue but the elements have a priority
//the highest priority come at the first and remvoved first(poll())
//elments must always be arranger in ascending or descending order
//if elements are same follows fifo
//unordered PQ - insertion end(O(1)); deleteMax - find element and delete(O(n))
//ordered PQ - insert : find correct pos and insert(O((n)), deleteMax:delete last element(O(1))
// we need O(log n) insertion and deletion
//binary heap - insertion and deletion - O(log n)

//Array implementation
class UnorderedMaxPQ
{
    private int pq[];
    private int n;

    public UnorderedMaxPQ(int capacity){
        pq = new int[capacity];
    }
    public void insert(int a)
    {
        pq[n++] = a;
    }
    public boolean isEmpty()
    {
        if(n==0) return true;
        else return false;
    }
    public int deleteMax()
    {
        //find max element
        int max=0;
        for(int i=0;i<pq.length;i++)
        {
            if(pq[i] > pq[max])
            {
                max=i;
            }
        }
        //swap max index with the last index
        int temp = pq[max];
        pq[max] = pq[n-1];
        pq[n-1] = temp;
        return pq[--n];
    }
    public void print()
    {
        System.out.println("Elements of array are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(pq[i] + " ");
        }
    }
}

class UnorderedPriorityQueue{
    public static void main(String[] a)
    {
        UnorderedMaxPQ obj = new UnorderedMaxPQ(5);
        obj.insert(2);
        obj.insert(4);
        obj.insert(7);
        obj.insert(1);
        obj.print();
        obj.deleteMax();
        obj.print();
        obj.insert(17);
        obj.print();


    }
}