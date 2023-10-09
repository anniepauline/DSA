public class OuterSquare {
    public static void main(String[] a)
    {
        int n=20;
        for(int i=0;i<=n;i++)
        {            
                for(int j=0;j<=n;j++)
                {
                    if(i==0 || i==n||j==0||j==n)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();            
        }
    }
}
