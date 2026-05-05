// types of interface
// 1- Normal   2-SAM(single abstract method)/ functional 3- Marker
//1- Normal   it contain two or more abstract methods as we know that in interface all methods are by default public abstract
//2- SAM ONly one abstract method
//3- no method just blank to get permsiion from compiler like game in which when we save game the values store in hard drive of object by defaul the compiler not allow so we take permission by blank interface 
// this is know as serializtion and decrilization
// 1-normal interface
 interface A {
// by default public abstract
void display();
  
}
//2 Functional Interface or SAM SIMPLE ABSTRACT METHOD
@FunctionalInterface
interface functional {
void show();
  
}





public class Types_of_interface {
  public static void main(String[] args) {
    A obj=new A() 
      
    {
       public void display(){
        System.out.println("heloo");
      }
    };
    obj.display();

    // functional interface
    // it have only one method 
    functional obj1= new functional() {
      public void show(){
        System.out.println("Functional interface");
      }
    };
    obj1.show();

    
  }
}
