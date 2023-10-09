public class PrintBinary {
    public static void main(String[] a)
    {
        int m=30;   
        for(int i=0;i<m;i++)
        {
            int n=1;
            for(int j=0;j<=i;j++)
            {   
                int sum = i+j;
                if(sum%2==0)
                {
                 System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }        
    }    
}


