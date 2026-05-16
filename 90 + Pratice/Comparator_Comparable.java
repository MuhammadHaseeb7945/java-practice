import java.lang.invoke.StringConcatFactory;
import java.util.*;
import java.util.Collections;


class Students1 implements Comparable<Students1>{
  int age;
String name;
  public Students1(int age, String name){
   this.age=age;
   this.name=name;
}     
// toString() isliye use kiya hai taa ke object ko print karte waqt readable output aaye.

// Agar toString() override na karo to Java object ka weird output deta hai.
public String toString(){
  return "Student [age=" + age + ", name=" + name + "]";    
}


public int compareTo(Students1 that){  // ya comparable interface implements krta ha jis ma compareTo keyward ha
   if(this.age>that.age){
    return 1;
   }
   else{
    return -1;
   }
}



}

public class Comparator_Comparable {
  // comparator 
  //ya custom sorting krta ha

  public static void main(String[] args) {
  //   List<Integer> num= new ArrayList<Integer>();
  // num.add(22);
  List <Integer> num= Arrays.asList(10,12,19,14,15); // new method ha
  System.out.println(num);
Collections.sort(num);
// default osrting and best for the simple list 
System.out.println(num);

// Comparator Custom Sorting Deta Hai

// Normal sorting:

// Collections.sort(nums);

// Custom sorting:

// Collections.sort(nums, com);

// Second parameter comparator hota hai.
Comparator<Integer> com= new Comparator<Integer>() {
      public int compare(Integer i,Integer j){
     if(i%10<j%10){
      return 1;
     }
     else{
      return -1;
     }
      }
};
System.out.println("This is custom sorting");
Collections.sort(num,com);
System.out.println(num);



// comparable 
// Comparable

// Default identity sorting:

// Employee ID
// Roll Number

List<Students1> nu2= new ArrayList<Students1>();
nu2.add(new Students1(10,"new"));
nu2.add(new Students1(29,"old"));
nu2.add(new Students1(30,"too old"));
Collections.sort(nu2);
for(Students1 name : nu2){
  System.out.println(name);
}

  }
  
}
