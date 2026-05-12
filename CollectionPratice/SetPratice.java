// set is use to store the unique elements and also it doesnot have indexing
// it also doent maintan the insertion sequence as like the list

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPratice {
  public static void main(String[] args) {
    
  Set<Integer> num = new HashSet<Integer>();
  num.add(20);
  num.add(30);
  num.add(40);
  num.add(50);
  num.remove(50);
  System.out.println(num);

  // so collection ek interface ha and next list ek class ha array list subclass ha linked list also
  Set<Integer> num1 = new TreeSet<Integer>();  // tree set isko sorted form ma kr deta ha 
  num1.add(20);
  num1.add(30);
  num1.add(40);
  num1.add(50);
  num1.remove(50);
  System.out.println(num1);
  }
  
}
