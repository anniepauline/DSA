//Djikstra's 2 stack algorithm
//value - push to val stack
//operator-push to op stack
//left brace - igonre
//right brace - pop 2 values from val stack and 1 from op and perform operation. push back to val stack

class stackImplement
{
    private Node head = null;
    //inner class
    private class Node{
        String data;
        Node link;
    }
     

    public boolean isEmpty()
     {
        if(head == null)
        return true;
        else return false;
     }

     public void push(String s)
     {
        Node temp = new Node();
        temp.data = s;
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


class StacksUsingLL
{
    public static void main(String[] a)
    {
        stackImplement obj = new stackImplement();
        obj.push("A");
        obj.push("B");
        obj.push("C");
        obj.push("D");
        obj.push("E");
        obj.pop();
        if(obj.isEmpty())
        {
           System.out.println("Data exists");
        }
        obj.print();
        

    }
}