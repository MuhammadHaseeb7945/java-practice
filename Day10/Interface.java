//Interface ka undr hmra pass by default public abstract hota ha udr abstract class ki trh likhna ki zroort ni
// same like abstract class but interface can be many 1 2 3 a you can make
// think like design of mobile and it is interface and you will implement desing actual is class
// if we want to implement the interface then we will use the keyword of implement 
// if we want the inheritance in interface then we will use the extend keyword in interface

 interface Mobile {
  void touch();
  
}
 interface Samsung extends Mobile{
  void button();
  
}
interface Infinx extends Mobile{
  void display();
  
}
  class Manfacture implements Infinx,Samsung{
    public void touch(){
      System.out.println("Touch mobile defualt");
    }
    public void button(){
     System.out.println("Samsun button mobile");
    }
    public void display(){
     System.out.println("infinx touch mobile");
    }

  }



public class Interface{
  public static void main(String[] args) {
  Infinx obj= new Manfacture();
  obj.display();
  obj.touch();
  ((Samsung)obj).button(); // id type cast kr dia ha agr dosra bi interface use krna ha
 

//   Simple example:

// Mobile ka design (interface) bolta hai:

// touch hona chahiye
// display hona chahiye

// But kaise kaam karega → wo class decide karegi (Samsung, Infinix, etc.)

// 💡 Short bullets:
// Code ko flexible banata hai
// Multiple inheritance allow karta hai
// Rules enforce karta hai
    
  }
}