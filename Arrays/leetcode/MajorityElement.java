import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String args[]) {
        // Your code goes here
        int max = Integer.MIN_VALUE;
        int key = 0;
        int[] arr = { 2 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entr : map.entrySet()) {
            System.out.println(entr.getKey() + " " + entr.getValue());
            max = Math.max(max, entr.getValue());
            System.out.println(max);
            key = map.get(max);
        }
    }
}