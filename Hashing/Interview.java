import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    int max = 0;
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0;i<operations.size();i++)
        {
        if(operations.get(i).contains(" "))
        {
          String parts[] = operations.get(i).split(" ");
         
            int operator = Integer.parseInt(parts[0]);
            int operand = Integer.parseInt(parts[1]);
                  
            if(operator == 1)
            {
                max = Math.max(max,operand); 
                list.add(max);
            }     
        }
        else
        {
            if(Integer.parseInt(operations.get(i)) == 2)
            {         
               // list.remove(Integer.valueOf(max));
                //list.remove((Integer) max);
                int index = list.indexOf(max); 
                list.remove(index);
                if (list == null || list.size() == 0) {
                  max= Integer.MIN_VALUE;
                }
                max = Collections.max(list);
            }
        }
       
    }
         return list;
    }
   

}

public class Interview {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
       
    }
     
}
