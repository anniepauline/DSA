public class Pyramid {
    public static void main(String[] a)
    {
        int n=10;
        for(int i=0;i<n;i++)
        {           
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" "+ i + "  ");
            }
             System.out.println();
        }
    }
}
