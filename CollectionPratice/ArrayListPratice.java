// java ma array list dynamic data ko store krna ka lia use hoti ha as you know ka array have fixed size and it cannot be changed means if it have 5 size you cannot store 6 elements in it so thats why we use array list.
// it can contain duplicate elements

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListPratice {
  public static void main(String[] args) {
//Collection interface use hui hai
// Object actually ArrayList ka hai
// Lekin reference Collection type ka hone ki wajah se aap sirf woh methods use kar sakte ho jo Collection interface me available hain
   Collection<Integer> num= new ArrayList<Integer>();
   num.add(20);
   num.add(30);
   num.add(20);
   System.out.println(num);
   // so array list cannot contain unique elements also its elemnt are by default in sequence that we give
  
   // so  if type collection rkha or usma arraylist use krain to wo by defualt index value ni da ga so we can use the list if we want the index

    List<Integer> num1= new ArrayList<Integer>();
   num1.add(20);
   num1.add(30);
   num1.add(20);
   System.out.println(num1.indexOf(20));




    
  }
}
