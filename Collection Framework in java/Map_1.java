import java.util.*;
import java.util.*;

public class Map_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();//hashmap is unordered map and it can have
        //duplicate value but not key and also does support null value
        // add something in map 
        map.put(1,"Kushal");
        map.put(2,"Ku");
        map.put(3,"Kus");
        map.put(4,"Kush");
        map.put(5,"Kushal");
        map.put(6,null);
        map.put(7,null);
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
                Map.Entry entry = (Map.Entry)itr.next();
                System.out.println(entry.getKey() + " , "  + entry.getValue());
        }
        //we can use directly for each also with map entry
        for (Map.Entry m : map.entrySet())
        { System.out.println("Key = " + m.getKey() + " and Value is = " + m.getValue() );
        }
        // --> we are checking if
        
    }
}
