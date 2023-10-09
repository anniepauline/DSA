//Given an integer array, find all elements that appear more than n/3 times
//nums[]={1,3,2,5,1,3,1,5,1} o/p = {1}
//if key does not exixts, put into map with value 1
//if key already exists, increemtn value
//if value > n/3 return key
import java.util.*;

public class MajorityElement {
    public static void main(String[] a)
    {
        int arr[]={1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            
        }
        int n=(arr.length)/3;
        for(Integer key : map.keySet())
        {
            if(map.get(key) > n)
            {
                System.out.println(key);
            }
        }
    }
}
