//Microsift,Ola
//Find Iternariry from tickets
import java.util.HashMap;

public class Iternariry {
    public static void main(String[] args)
    {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        //find out to and from
        String start="";
        for(String i: map.keySet())
        {
            if(!map.containsValue(i))
            {
                start = i;
                System.out.print(start+" ");
                start=map.get(start);
                System.out.print(start+" ");
            }
        }
        while(map.containsKey(start))
        {          
            start = map.get(start);
            System.out.print(start+ " ");
        }
    }
}
