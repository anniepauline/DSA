// a symbol table (ordered) impleemnted in Binsary tree
// insertion takes O(n) and search takes O(log n)
// to make both the operation log n we use BST
//bst - best case-O(log n) wost case = O(n)
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private class Node{
        private Node left,right;
        private int data;
    }
    private Node root;

    public Node getNode(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    public Node insert( Node root,int data)
    {
        if(root==null)
        { root = getNode(data);
         System.out.println((root.data));}
       
        else if(data < root.data)
        {
            root.left = insert(root.left, data);
        }
        else
        {
            root.right = insert(root.right,data);
        }
        return root;
    }
    public Node findMin(Node root)
    {
        Node min = root;
        while(min.left !=null)
        {
            min = min.left;
        }
        return min;
    }
     public Node findMax(Node root)
    {
        Node max = root;
        while(max.right !=null)
        {
            max = max.right;
        }
        return max;
    }
    public Node delete(Node root, int data)
    {
        if(root == null) return null;
        else if(data < root.data)
        {
            root.left = delete(root.left,data);
        }
        else if(data > root.data)
        {
            root.right = delete(root.right,data);
        }
        else
        {
            if(root.left == null && root.right ==null)
            {
                root=null;
            }
            else if(root.left == null)
            {
                Node temp = root;
                root = root.right;
                root=null;
            }
            else if(root.right == null)
            {
                Node temp = root;
                root = root.left;
                root=null;
            }
            else{
                Node temp = findMin(root.right);
                root.data = temp.data;
                root.right = delete(root.right,temp.data);
            }
        }
        return root;
    }
    public boolean search(Node root, int data)
    {   
        if(root == null) return false;
        if(root.data == data)
        {
            System.out.println("found!");
            return true;
        }
        else if(root.data >= data)
        {
            return search(root.left,data);
        }
        else
            return search(root.right,data);
    }
    public void InOrderTraversal(Node root)
    {
        
        if(root == null){ return;}
        System.out.print(root.data + " ");
        InOrderTraversal(root.left);
         System.out.print(root.data + " ");
        InOrderTraversal(root.right);
       
    }
    public void levelOrder(Node root)
    {
        if(root==null)return;
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty())
        {
            Node current = Q.peek();
            System.out.print(current.data + " ");
            if(current.left !=null){
                Q.add(current.left);
            }
            if(current.right!=null)
            {
                Q.add(current.right);
            }
            Q.remove();
        }
    }
    public int maxHeight(Node root)
    {
        if(root == null) return -1;
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] a)
    {
        Node root = null;
        BST obj = new BST();
        root = obj.insert(root, 15);
        System.out.println("Root data: "+ root.data);
        root = obj.insert(root, 10);
        System.out.println("Root data: "+ root.data);
        root = obj.insert(root, 8);
        System.out.println("Root data: "+ root.data);
        root = obj.insert(root, 20);
        obj.InOrderTraversal(root);
        obj.search(root,51);
        obj.delete(root, 15);
        
        Node min = obj.findMin(root);
        System.out.println((min.data));
        Node max = obj.findMax(root);
        System.out.println((max.data));
        obj.levelOrder(root);
        int height = obj.maxHeight(root);
        System.out.print("Max height:"+height);
    }
}
