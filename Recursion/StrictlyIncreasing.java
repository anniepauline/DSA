//check if array is strictly increasing
//for strictly decreasing: check arr[i] > arr[i+1]
public class StrictlyIncreasing {
    public static boolean isSorted(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] < arr[i+1])
        {
            return isSorted(arr, i+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] a)
    {
        int arr[]={9,1,3,5};
        System.out.println(isSorted(arr,0));

        
    }
}
