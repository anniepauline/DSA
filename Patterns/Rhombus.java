public class Rhombus {
    public static void main(String[] a)
    {
        int n=20;
        int m =(2*n)-1; //9
        for(int i=0;i<m-n;i++)
        {
            for(int k=0;k<m-n-i;k++)
            {
                System.out.print("  ");
            }

            for(int j = n-1; j<m;j++)
            {
                System.out.print(" * ");
            }
             System.out.println();
        }
    } 
}
