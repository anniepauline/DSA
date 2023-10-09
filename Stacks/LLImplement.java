

import java.util.*;


class LL{

    Node head=null;
    private class Node
    {
        int data;
        Node next;
    }

    public void insert(int data,int position)
    {
        Node temp = new Node();
        temp.data = data; 
        temp.next=null;    
        if(position==1)
        {
            temp.next = head;
            head = temp;
            return;
        }

        Node temp1 = new Node();
        temp1=head;
        for(int i=0;i<position-2;i++)
        {
            temp1=temp1.next;
        }
        temp.next = temp1.next;
        temp1.next=temp;            
    }

    public void delete(int position)
    {
        Node temp = new Node();
        temp = head;

        if(position==1)
        {
           head =  temp.next;
            return;
        }
        Node temp1 = new Node();
        for(int i = 0; i < position-2;i++)
        {
            temp = temp.next;
        }
        temp1 = temp.next;
        temp.next = temp1.next;

    }
    public void reverse()
    {
        Node prev = new Node();
        Node next = new Node();
        Node current = new Node();

        prev = null;
        current = head;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
   
    public void print()
    {
        Node temp = head;
        
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class LLImplement {
    public static void main(String[] a)
    {
        LL obj = new LL();
        obj.insert(1, 1);
        obj.insert(2, 2);
        obj.insert(3, 3);
        obj.insert(4, 4);
        obj.delete(1);
        obj.reverse();
        obj.print();
    }
}
