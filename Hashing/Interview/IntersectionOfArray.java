//Intersection of 2 arrays
import java.util.HashSet;

public class IntersectionOfArray {
    public static int Intersection(int arr1[],int arr2[])
    {
         HashSet<Integer> set = new HashSet<>();
        int count =0;
        for(int data :arr1)
        {
            set.add(data);
        }
        for(int j:arr2)
        {
            if(set.contains(j))
            {
                //System.out.print(j+ " ");
                count++;
                set.remove(j);
            }
        }
        return count;
    }
    public static int Union(int arr1[],int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i:arr1)
        {
            set.add(i);
        }
        for(int j:arr2)
        {
            set.add(j);
        }
        return set.size();
    }
    public static void main(String[] args)
    {
        int arr1[]={7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println( Intersection(arr1, arr2));
        System.out.println( Union(arr1, arr2));
        
    }
}
