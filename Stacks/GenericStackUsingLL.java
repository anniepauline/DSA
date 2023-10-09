//Generic array creaion is not allowed in java
//generics help us to create user defined data types
//this stack must work for int, string or any data
//good code have no casts
// use any generic type for any data except arrays
//addfirst, adlast, remove first, remove last, iterator
class Stack<item>
{
    private Node head = null;
    //inner class
    private class Node{
        item data;
        Node link;
    }
     

    public boolean isEmpty()
     {
        if(head == null)
        return true;
        else return false;
     }

     public void push(item item)
     {
        Node temp = new Node();
        temp.data = item;
        temp.link = head;
        head = temp;  
     }

     public void pop()
     {
        Node temp = new Node();
        if(head == null)
        {
            return;
        }
        temp = head;
        head = temp.link;
        System.out.println("Popped: " + temp.data);
        temp = null;
     }

     public void print()
     {
        Node temp = head;
        System.out.println("Stack elements are:");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.link;
        }
     }
}


class GenericStackUsingLL
{
    public static void main(String[] a)
    {
        // Stack<Boolean> obj = new Stack<Boolean>();
        //Stack<String> obj = new Stack<String>();
        //Stack<Integer> obj = new Stack<Integer>();

        Stack<Integer> obj = new Stack<>();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.pop();
        if(obj.isEmpty())
        {
           System.out.println("Data exists");
        }
        obj.print();
        

    }
}