public class ButterFly {
    public static void main(String[] a)
    {
        int n=15;
        int topSpace = (n*2) -2;
        int bottomSpace = 0;
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<=j;k++)
                {
                    System.out.print(" *");
                }
                if(topSpace>0)
                {
                for(int l=topSpace; l>=1;l--)
                {
                    System.out.print("  ");
                }
                }
                for(int m=0;m<=j;m++)
                {
                     System.out.print(" *");
                }
                  System.out.println();
                  topSpace-=2;
            }
            for(int b=0;b<n;b++)
            {
                for(int c=n-b;c>0;c--)
                {
                    System.out.print(" *");
                }
                 if(bottomSpace<n*2)
                {
                for(int l=bottomSpace; l>=1;l--)
                {
                    System.out.print("  ");
                }
                }
                  for(int c=n-b;c>0;c--)
                {
                    System.out.print(" *");
                }
                System.out.println();
                bottomSpace+=2;
            }
           
        
    }
}
