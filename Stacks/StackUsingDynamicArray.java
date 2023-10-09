//push - increase the size of array by repeated doubling(2xsize) 
//pop - shrink the array, when the size of array is size/4, shrink to size/2
// that way for pop() psush() pop() push() continously we dont have to skrink all the time
//push - double size
//pop - halving size (iff top = S.len/4)
//best case 0(1)
//worst case 0(n)  
//ArrayList is java.util is resizibe array


class ArrayResize{
    private int top = 0;
    private String S[];

   
   public ArrayResize()
   {
    S = new String[1];
   }

    public void push(String data)
    {   if(top == S.length)
        {
            resize(S.length *2);
        }    
        S[top] = data;
        top++;      
    }
     public void resize(int size)
    {
        String[] cpy = new String[size];
        for(int i=0;i < S.length; i++)
        {
            cpy[i] = S[i];
        }
        S=cpy;
    }

    public void pop()
    {    
         
        String item = S[--top]; 
        S[top] = null;      
        if(top > 0 && top == S.length/4)
        {
            resize(S.length/2);
        }
        System.out.println("Popped: "+ item);
    }

    public void print()
    {
        for(String i: S)
        {
            System.out.println(i);
        }
    }
}

public class StackUsingDynamicArray {
    public static void main(String[] s)
    {
        ArrayResize obj = new ArrayResize();
        obj.push("A");
        obj.push("B");
        obj.push("C");
        obj.push("D");
        obj.print();
        obj.pop();
        obj.push("E");
        obj.print();
    }
}
