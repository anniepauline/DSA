//print keyPad Combination O(n power n)
public class keyPadComb {
    public static String[] keyPad={"." ,"abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void combination(String str, int index, String combi)
    {
        if(index==str.length())
        {
            System.out.println(combi);
            return;
        }
        int curreIndx= str.charAt(index);
        String mapping = keyPad[curreIndx-'0'];

        for(int i=0;i<mapping.length();i++)
        {
            combination(str, index+1, combi+mapping.charAt(i));
        }

    }
    public static void main(String[] a)
    {
         String str = "23";
         combination(str,0,"");
    }
}
