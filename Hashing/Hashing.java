//hash set

import java.util.*;
public class Hashing {
    public static void main(String[] args)
    {
        //HASHSET
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(13);
        set.add(30);
        set.add(310);
        //contains
        if(set.contains(1))
        {
            System.out.println("Set contains 1");
        }
        if(!(set.contains(6)))
        {
            System.out.println("Set does not contain 6");
        }
        //remove
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("Set does not contains 1");
        }
        
        System.out.println("Set size " + set.size());
        System.out.println("All elements :"+set);
        //iterator
        Iterator it = set.iterator();
        while(it.hasNext()) // hasNext() - bool
        {
             System.out.println(it.next());//next() - val
        }
        System.out.println("------------------------");
        //HASHMAP

        HashMap<String,Integer> map = new HashMap<>();
        //insert
        map.put("India",100);
        map.put("US",100);
        map.put("China", 10);
        map.put("China", 180);
        System.out.println(map);

        //search
        if(map.containsKey("China"))
        {
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not  present in the map");
        }
        //fetch
        System.out.println("India value:" + map.get("India"));
        System.out.println("Chille value:" + map.get("Chille"));
        System.out.println("-------------------------------");

        //EntrySet
        //for(e:arr)
        for( Map.Entry<String,Integer>element : map.entrySet())
        {
            System.out.println(element.getKey() + " :" + element.getValue());
        }    
        //keySet  
        Set<String> keys = map.keySet();
        
        for(String key:keys)
        {
            System.out.println(key + " :" + map.get(key));
        }
        //remove
        map.remove("India");
        System.out.println(map);
    }
}
