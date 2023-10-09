public class Subsequence {
    public static void subsequence(String str,int i, String newString)
    {
        if(i == str.length())
        {
            System.out.println(newString);
            return;
        }
        char current = str.charAt(i);
        
        //to be
        subsequence(str, i+1, newString+current);
        //not to be
        subsequence(str, i+1, newString);
    }
    public static void main(String[] s)
    {
        String str = "abc";  
        subsequence(str,0,"");
    }
}
