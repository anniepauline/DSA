public class PrintInvertedNums {
    public static void main(String[] a)
    {
        int n=15;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" "+ j+ " ");
            }
            System.out.println();
        }
    }
}
