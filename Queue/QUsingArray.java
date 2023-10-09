// Q implementation using array


class ArrayImplement
{
    private int front = -1;
    private int rear = -1;
    private String S[];
    
    public ArrayImplement() {
         S = new String[1];
    }


    public void enqueue(String data)
    {
        if(rear+1 == S.length)
        {
            resize(S.length*2);
        }
        
        if(isEmpty())
        {
          front++;
          rear++;
          S[rear] = data;
        }
        else{
          rear +=1;
          S[rear] = data;
        }
               
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            return;
        }
         if(front == rear)
        {
            S[front] = null;
            front = -1;
            rear = -1;
        }
        else
        {
            S[front++] = null;
           
        }
    }
    public boolean isEmpty()
    {
        if(front== -1 && rear == -1)
        {
            return true;
        }
        else return false;
    }
    public void resize(int size)
    {
        String[] cpy = new String[size];
        for(int i=front; i <= rear;i++)
        {
            cpy[i] = S[i];
        }
        S = cpy;
    }
    public void print()
    {
        for(String i : S)
        {
            System.out.println(i);
        }
    }
}


public class QUsingArray {
    public static void main(String[] s)
    {
        ArrayImplement obj = new ArrayImplement();
        obj.enqueue("A");
        obj.enqueue("B");
        obj.dequeue();
        obj.enqueue("C");
        obj.enqueue("D");
        obj.dequeue();
        obj.print();
    }   
}
