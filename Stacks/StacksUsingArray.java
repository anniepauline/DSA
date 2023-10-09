 //Array implementation of StacksUsingArray
 // overflow-no enuf space 
 //underflow - removing elements even if not exist
 //Time complexity : Constant time
 //Space complexity : Constant time
 //try to implemenst using array resize
 //the size os fixed
 
 class FixedArray{

    private int top = -1;
    private String[] S;

    public FixedArray(int size) {
        S = new String[size];
    }
    
    public void push(String s)
    {
        int size = S.length;
        if(top ==  size-1)
        {System.out.println("Stack overflow");
        }
        S[++top] = s;
    }
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack undeflow");
        }
        System.out.println("Popped: " + S[top]);
        S[top] = null;
        top--;
    }

    public boolean isEmpty()
    {
       if(top == -1)
       {
        return true;
       }
       else
       return false;
    }

    public void print()
    {
        for(String i : S)
        {
            System.out.println(i);
        }
    }

}


public class StacksUsingArray {
    public static void main(String[] a)
    {
      FixedArray obj = new FixedArray(4);
      obj.push("A");
      obj.push("B");
      obj.push("C");
      obj.push("D");
      obj.print();
      obj.pop();
      if(obj.isEmpty())
      {
        System.out.println("Empty String array");
      }



    }
}
