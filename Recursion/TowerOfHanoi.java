
//complexity -O(2(n-1))+1 => O()
public class TowerOfHanoi {
    public static void TOH(int n,String src,String helper,String des)
    {   //if only 1 disk..move from s->d
        if(n==1)
        {
            System.out.println("Transfer disk from "+ src +" to "+des);
            return;
        }
        //move n-1 from S->D O(n-1)
        TOH(n-1, src, des, helper);
        System.out.println("Transfer disk from "+ src +" to "+des);
        //move n-1 disk to destination- O(n-1)
        TOH(n-1, helper, src, des);
    }
    public static void main(String[] a)
    {
        int n=3;
        TOH(n, "S","H", "D");
    }
}
