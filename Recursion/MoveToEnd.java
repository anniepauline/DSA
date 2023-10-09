//move a char to end
public class MoveToEnd {

    public static void move(String str, int index,char s,String newString,int count)
    {
        if(index == str.length())
        {
            while(count >0)
            {
                newString+= s;
                count--;
            }
            System.out.println(newString);
            return;
        }
        char current = str.charAt(index);
        if(current!= s)
        {
            newString+= current;
            move(str,index+1,'x',newString,count);
        }
        else{
            count++;
            move(str,index+1,'x',newString,count);
        }
    }
    public static void main(String[] a)
    {
        String str = "axbcxxd";
        String newString="";
        move(str,0,'x',newString,0);
        
    }
}
