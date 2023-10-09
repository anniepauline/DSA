public class Subset {
    public static void findSubset(int[] arr,int idx,String newArray)
    {
        if(idx == arr.length)
        {
            System.out.println(newArray);
            return;
        }
        int current = arr[idx];
        
            findSubset(arr,idx+1,newArray+current);           
            findSubset(arr,idx+1,newArray); 
    }
    public static void main(String[] a)
    {
        int arr[] = {1,2,3};
        findSubset(arr,0,"");
    }
}
