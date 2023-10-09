//count paths in a  maze (used backtracking)
public class PathCount {

    public static int pathCount(int m, int n, int i, int j)
    {
        if( i ==n-1 || j== m-1)
        {
            return 1;
        }
        if( i ==n || j == m)
        {
            return 0;
        }

        int downPath = pathCount(m, n, i+1, j);
        int rightPath = pathCount(m, n, i, j+1);
        return downPath + rightPath;
    }
    public static void main(String[] a)
    {
        int m=3, n=3;
        int totalPaths = pathCount(m,n,0,0);
        System.out.println(totalPaths);
    }
}
