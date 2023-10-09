//Linked list implementation of Q
//we can use java.util.Queue. - takes Nto the power 4 seconds
//Best practise - use out=r implementation
class LlImplement{

    private Node front = null;
    private Node rear = null;
    
    private class Node{
        String data;
        Node next;
    }

    public void enqueue(String s)
    {
        //inserting at rear
        Node temp = new Node();
        temp.data = s;
        
        if(isEmpty())
        {
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp; 


    }
    public void dequeue()
    {
        //deleting at the front
        //1 node
        if(front == rear)
        {
            front = null;
            rear = null;
        }
        Node temp = new Node();
        temp = front;
        front = temp.next;
        temp = null; 

    }
    public boolean isEmpty()
    {
        if(front == null && rear == null)
        {
            return true;
        }
        else return false;
    }

    public void print()
    {
        Node temp = front;
        System.out.println("Q elements are:");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

public class QUsingLL {
    public static void main(String[] a)
    {
        LlImplement obj = new LlImplement();
        obj.enqueue("A");
        obj.enqueue("B");
        obj.enqueue("c");
        obj.enqueue("D");
        obj.print();
        obj.dequeue();
        obj.print();
    }
}
