public class OrderedNums {
    public static void main(String[] a)
    {
        int n=1;
        for(int i=0;i<5;i++)
        {
            
            for(int j=0;j<=i;j++)
            {   
                System.out.print(n + " ");
                n=0;
            }
            System.out.println();
        }        
    }    
}
