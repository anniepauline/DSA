//put - add data
//get - get data
//contains - key exists
//remove - ky value pair
//keySet() 

import java.util.*;


public class HashMapCode {
    static class HashMap<K,V>{
        //LL node structure
        private class Node{
        K key;
        V value;
        
        public  Node(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
      }
    
    private int N;  //buckets.len
    private int n;  //nodes.len
    //private int a[];
   private LinkedList<Node> buckets[];

    @SuppressWarnings("unchecked")
    public HashMap() {
        this.N = 4;
        this.buckets = new LinkedList[4];
        //create empty LL
        for(int i=0;i<4;i++)
        {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key)
    {
        int bi = key.hashCode();
        return Math.abs(bi) % N;

    }
    private int searchInLL(K key, int bi)
    {
        LinkedList<Node> ll = buckets[bi];
        
        for(int i=0;i<ll.size();i++)
        {
            if(ll.get(i).key == key)
            {
                return i;//data index
            }
        }
        return -1;
    }
    @SuppressWarnings("unchecked")
    private void reHash()
    {
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[N*2];

        for(int i =0; i <N*2;i++)
        {
            //creat an empty LL at each array index i
            buckets[i] = new LinkedList<>();
        }

        for(int i =0; i < oldBucket.length;i++)
        {
            //ll at every arr index i
            LinkedList<Node> ll = oldBucket[i];
            for(int j=0;j< ll.size();j++)
            {
                //cpy node from ll to new arr index
                Node node = ll.get(j);
                put(node.key,node.value);
            }
        }

    }
    public void put(K key, V value) {
        int bi= hashFunction(key);
        //search for the key in bucket index
        int di = searchInLL(key,bi); //data index in LL
        //key !exist
        if(di == -1)
        {
            buckets[bi].add(new Node(key,value));
            n++;
        }
        else{
            Node data = buckets[bi].get(di);
            data.value = value;
        }
        double lambda =  (double)n/N;
        if(lambda > 2.0)
        {
            reHash();
        }
    }

    public V get(K key)
    {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        if(di==-1)
        {
            return null;
        }
        else{
            Node node = buckets[bi].get(di);
            return node.value;
        }
    }
    public boolean containsKey(K key)
    {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        if(di==-1)
        {
            return false;
        }
        else return true;
    }
    public V remove(K key)
    {
        //remove if exists and return val
        //else return null
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        if(di==-1)
        {
            return null;
        }
        else{
            Node node = buckets[bi].remove(di);    
             n--;     
            return node.value;
           
        }
    }
    public boolean isEmpty()
    {
        return n==0;
    }
    public ArrayList<K> keySet()
    {   
        ArrayList<K> keys = new ArrayList<>();
        for(int i=0;i<buckets.length;i++) //bi
        {
            LinkedList<Node> ll = buckets[i];
            for(int j=0;j<ll.size();j++) //di
            {
                Node node = ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }
}
    public static void main(String[] args)
    {
        HashMap<String,Integer> obj = new HashMap<>();
        obj.put("India",190);
        obj.put("China",200);
        obj.put("USA",20);
        obj.put("Pak",500);

        ArrayList<String> keys = obj.keySet();
        for(int i=0;i<keys.size();i++)
        {
            System.out.println(keys.get(i) + " " + obj.get(keys.get(i)));
        }
        System.out.println(obj.get("India"));
        // obj.remove("India");
        // System.out.println(obj.get("Inida"));
    }
}
