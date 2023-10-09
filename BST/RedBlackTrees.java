import java.util.*;

public class RedBlackTrees{
static class RBT<K,V> 
{
    Node<K,V> root;
    int size;
    private class Node<K,V>{
        K key;
        V value;
        Node<K,V> left, right,parent;
        boolean isLeftChild;
        boolean isBlack;

        public Node (K key, V value){
            this.key = key;
            this.value = value;
            left = right = parent=null;
            isBlack=false;
            isLeftChild = false;
        }
    }
    public void add(K key, V value)
    {
        Node<K,V> newNode = new Node<K,V>(key,value);
        if(root==null)
        {
            root=newNode;
            root.isBlack=true;
            size++;
        }
        add(root,newNode);
        size++;
    }
    private Node add(Node<K,V> parent,Node <K,V> newNode)
    {
         //add to right
        if(((Comparable<K>) newNode.key).compareTo(parent.key) > 0)
        {
            //add to right
            if(parent.right==null)
            {
                parent.right = newNode;
                newNode.parent = parent;
                newNode.isLeftChild=false;
                return newNode;
            }
            return add(parent.right,newNode);
        }
        //add to left
         else{
            if(parent.left ==null)
            {
                parent.left=newNode;
                newNode.parent = parent;
                newNode.isLeftChild=true;
                return newNode;
            }
            return add(parent.left,newNode);
        }
        // checkColor(newNode);
    }

    public void checkColor(Node<K,V> newNode)
    {
        if(newNode==root)
        {
            return ;
        }
        //2 consecutive red's
        if(!newNode.isBlack && !newNode.parent.isBlack)
        {
            correctTree(newNode);
        }
        //check till it reaches up to root
        checkColor(newNode.parent);
    }

    public void correctTree(Node<K,V> node)
    {   //left consecutive
        //is lfet child
        if(node.parent.isLeftChild)
        {
            //aunt=node.parent.parent.right
            //Black aunt - rotate,
            if(node.parent.parent.right.isBlack ||node.parent.parent.right==null)
            {
                rotate(node);
                return ;
            }
            //red aunt - flip color
            if(node.parent.parent.right!=null){
                //change aunt to black
                node.parent.parent.right.isBlack=true;
            }
            //gramdparent to red and parent to black
            node.parent.parent.isBlack = false;
            node.parent.isBlack=true;
            return;
        }
        // is right child
        else{
            //Black aunt - rotate
            if(node.parent.parent.left.isBlack ||  node.parent.parent.left==null)
            {
                 rotate(node);
                return;
            }   
            //red aunt - flipcolor
            if(node.parent.parent.left!=null)
            {
                //change aunt to black
                node.parent.parent.left.isBlack=true;
            }
            //grandparetn to red,parent to black
            node.parent.parent.isBlack=false;
            node.parent.isBlack=true;
            return;
        }
    }
    public void rotate(Node<K,V> node)
    {
        if(node.isLeftChild)
        {   //left child, left parent -R rorate
            if(node.parent.isLeftChild)
            {
                rotateRight(node.parent.parent);
                node.isBlack = false;
                node.parent.isBlack = true;
                if(node.parent.right!=null){
                node.parent.right.isBlack=false;}
                return;
            }
            //right child left parent - RL rotate <
            rightLeftRotate(node.parent.parent);
            node.isBlack=true;
            node.left.isBlack=false;
            node.right.isBlack=false;
            return;
        }
        //node is rightchild
        //right child, right parent
        if(!node.parent.isLeftChild)
        {
            rotateLeft(node.parent.parent);
            node.isBlack=false;
            node.parent.isBlack=true;
            node.parent.right.isBlack =false;
            return;
        }
        //left child,right parent- >
        leftRightRotate(node.parent.parent);
        node.isBlack=true;
        node.left.isBlack=false;
        node.right.isBlack=false;
        return;
    }
    public void rotateLeft(Node<K,V> node)
    {
        Node<K,V> temp = node.right;
        node.right= temp.left;
        //linkking node and temp
        if(node.right!=null)
        {
            node.right.parent=node;
            node.right.isLeftChild=false;
        }
        //if node is root
        if(node.parent==null)
        {
            root=temp;
            temp.parent=null;
        }
        else{
            temp.parent=node.parent;
            //if node is leftchild, temp is also left child
            if(node.isLeftChild)
            {
                temp.isLeftChild=true;
                temp.parent.left=temp;
            }
            else{   
                temp.isLeftChild=false;
                temp.parent.right=temp;
            }
            //attach temp to node.left
            temp.left=node;
            node.isLeftChild=true;
            node.parent=temp;
        }
    }
     public void rotateRight(Node<K,V> node)
    {
        Node<K,V> temp = node.left;
        node.left=temp.right;

        if(node.left!=null)
        {
            node.left.parent=node;
            node.left.isLeftChild=true;
        }
         //if node is root
        if(node.parent==null)
        {
            root=temp;
            temp.parent=null;
        }
        else{
             temp.parent=node.parent;
             //temp takes node's place
             //if node is left cild, temp is left child
            if(node.isLeftChild)
            {
                temp.isLeftChild=true;
                temp.parent.left=temp;
            }
            else{   
                temp.isLeftChild=false;
                temp.parent.right=temp;
            }
            //attach node to temp.right
            temp.right=node;
            node.isLeftChild=false;
            node.parent=temp;
        }
    }
    public void leftRightRotate(Node<K,V> node)
    {
        //input is grandparent
        rotateLeft(node.left);//on parent
        rotateRight(node );
    }
    public void rightLeftRotate(Node<K,V> node)
    {
        rotateRight(node.right);
        rotateLeft(node);
    }
    public int height(Node<K,V> node)
    {
        if(root==null)
        {
            return -1;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight,rightHeight) +1;
    }
    // public int blackNode(Node<K,V> node)
    // {
    //     if(node==null)
    //     {
    //         return 1;
    //     }
    //     int rightNode = blackNode(node.right);
    //     int leftNode = blackNode(node.left);
    //     if(rightNode!=leftNode)
    //     {
    //         return -1;
    //     }
    //     if(node.isBlack){
    //         leftNode++;
    //     }
    // }
    public void inorder(Node<K,V> root)
    {
        if(root==null)
        {
            return ;
        }
        //inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);       
    }
}
    public static void main(String[] args)
    {
        RBT<Integer,String> obj = new RBT<>();
        obj.add(1, "A");
        obj.add(2, "B");
        obj.add(3, "C");
        obj.inorder(obj.root);

    }
}