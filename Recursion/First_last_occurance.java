
public class First_last_occurance {
    public static int first = -1;
    public static int last = -1;
    public static void Occurance(String s,char target,int index)
    {
        if(index >= s.length())
        {
            System.out.println(first);
            System.out.println(last);
            return ;
        }
        char current = s.charAt(index) ;
        if(current == target)
        {
            if(first==-1)
            {
                first = index;
            }
            else{
                last = index;
            }
        }
        Occurance(s,target,index+1);
    }
    public static void main(String[] a)
    {
        String s= new String();
        s="baacdaefaah";
        Occurance(s,'a',0);
    }
}
