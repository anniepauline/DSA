//Print reverse string O(n)
public class PrintReverse {
    public static void print(String str,int i)
    {   if(i==str.length())
        {
            return;
        }
        print(str, i+1);
        System.out.print(str.charAt(i));
    }
    public static void main(String[] a)
    {
        String str = new String();
        str="abcdefghijklmnopqrstuvwxyz";
        print(str,0);

    }
}
