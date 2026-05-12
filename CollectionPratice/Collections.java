import java.util.ArrayList;
import java.util.Collection;

public class Collections {
  public static void main(String[] args) {
    //collections is used to store and manage the group of objects and to store
    Collection<Integer> num= new ArrayList<Integer>(); // ya collection ha but collection is used to manage the object or store so the value here store as the object so we have to specify the type so in future we will have the same datatype collection
    //collection object ko hande krti ha to premitive data type jes ka in float ya kam ni krta so we use the wrapper class ma jo prha tha premitive ko object ma convert kr deta ha
    num.add(2);
    num.add(3);
    num.add(4);
    num.add(5);
    System.out.println(num);
  System.out.println(num.getClass());
  Collection<Integer> num2 = new ArrayList<Integer>();
  num2.add(10);
  for(int i=0;i<num.size();i++){
    num2=num;
  }
  // enhance for loop
  for(int n:num2){
    System.out.println(num2);
  }
  System.out.println(num2);


    
  }
}
