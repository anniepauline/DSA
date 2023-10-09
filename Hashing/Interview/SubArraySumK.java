//Sub array sum equal to k

import java.util.HashMap;

public class SubArraySumK {
    public static int Subarray(int arr[],int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,count=0;
        for(int i:arr)
        {
            sum+=i;
            
            if(sum==k)
            {
                map.put(sum,1);
                count++;
            }
            else if(map.containsKey(sum-k))
            {
                count++;
                if(map.containsKey(sum))
                {
                    map.put(sum,map.get(sum)+1);
                }else{
                     map.put(sum,1);
                }               
            }
            else{
                map.put(sum, 1);
            }            
        }
        return count;
    }
    public static void main(String[] args)
    {
        //int arr[]={3,4,7,2,-3,1,4,2};
        int arr[]={5,0,5,10,3,2,-15,4};
        int k =5;
        int count = Subarray(arr,k);
        System.out.println(count);
    }
}
