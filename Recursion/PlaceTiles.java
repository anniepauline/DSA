//place 1*m tiles on m*n floor
//
public class PlaceTiles {
    public static int placeTiles(int n,int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }

        int vertical = placeTiles(n-m,m);
        int horizontal = placeTiles(n-1, m);
        return vertical + horizontal;
    }
 public static void main(String[] a)
 {
    int n=3; int m=3;
    int ways = placeTiles(n,m);
    System.out.println(ways);
 }   
}
