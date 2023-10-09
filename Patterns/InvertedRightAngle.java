public class InvertedRightAngle {
    public static void main(String[] a)
    {
        int n=30;
        for(int i=0;i<=n;i++)
        {
            //spaces
            for(int j=0;j<=n-i-1;j++)
            {
                 System.out.print("  ");
            }
            //stars
            for(int k=n-i;k<=n;k++)
            {
                 System.out.print("* ");
            }

            System.out.println("");       
        }
    }
}
