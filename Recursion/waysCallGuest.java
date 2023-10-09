//number of ways you can invite n perople to the party single or in pairs

public class waysCallGuest
{
    public static int callGuests(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        //single
        int ways1 = callGuests(n-1);
        //pair
        int ways2 = (n-1) * callGuests(n-2);
        return ways1+ways2;
    }
    public static void main(String[] a)
    {   
        int people = 4;
        int ways = callGuests(people);
        System.out.println(ways);
    }
}