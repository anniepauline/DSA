public class Palindrome {
    public static void main(String[] s)
    {
     int m=15;
        for(int i=0;i<m;i++)
        {   
            //space  
        for(int j=0;j<=m-i;j++)
        {
             System.out.print("  ");
        }
        //left palindrome
        for(int k=m-i;k<=m;k++)
        {   int n=m-k;
             System.out.print( " "+n );
             n=n--;
        }
        //right palindrome
        int n=1;
        for(int j=m-i;j<m;j++)
        {
             System.out.print(" "+n);
             n++;
        } 
        System.out.println();
       }
    }    
}
