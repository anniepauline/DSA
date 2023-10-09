public class UpSideDownTri {
    public static void main(String[] a)
    {
        int size = 30;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();    
            //size =size- 1;
        }
    }
}
