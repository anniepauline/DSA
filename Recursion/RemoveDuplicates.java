//remove duplicate characters from string
import java.util.HashSet;

public class RemoveDuplicates  {

    public static void remove(String str,int i,HashSet<Character> set,String newString)
    {
        char current = str.charAt(i);
        if(i == str.length()-1)
        {   
            for(char c: set)
            {
                newString+=c;
            }
            System.out.println(newString);
            return;
        }
        set.add(current);
        remove(str,i+1,set,newString);
    }
    public static void main(String[] a)
    {
        String str = "abbccda";
        HashSet<Character> set = new HashSet<>();
        remove(str,0,set,"");
    }
}
