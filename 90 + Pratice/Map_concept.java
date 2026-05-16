
// map is used to map your data in key value pairs as in array there is indexing which strt from 0 1 2 3 4 and whn we need to represent specific data instead of indexing then we can use the map

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_concept {
public static void main(String[] args) {
  // Map<String,Integer> num= new HashMap<>();   // hash map is not auto synchronized 
  Map<String,Integer> num= new Hashtable<>();
  num.put("Haseeb", 95);
  num.put("Muhammad", 96);
  num.put("Ali", 90);
  num.put("Awais", 91);

  System.out.println(num.get("Haseeb"));// get method is used to fetch the value of related eky that is passed in it
  System.out.println(num.values());// values gives the value of key
  for (String name:num.keySet()){  // keyset gives the all key
    System.out.println(name + " " + num.get(name));
    
  }
  
}
  
}