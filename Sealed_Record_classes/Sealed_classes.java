sealed class A permits B {
public void display(){
  System.out.println("Class A");
}
  
}
sealed class B extends A permits C{
public void display1(){
  System.out.println("Class B");
}

}

final class C extends B{

public void display2(){
  System.out.println("Class c");
}
}


sealed interface CollabA permits CollabB{
void prin();
  
}
sealed interface CollabB extends CollabA permits CollabC{
void lunc();
  
}
non-sealed interface CollabC extends CollabB{
void lon1();
  
}


public class Sealed_classes {
  public static void main(String[] args) {
    CollabC c= new CollabC() {
      public void prin(){
        System.out.println("Collab A");
      }
       public void lunc(){
        System.out.println("Collab b");
      }
      public  void lon1(){
        System.out.println("Collab c");
      }
    };
    c.lon1();
    c.lunc();
    c.prin();
    // final keyward hum ni lga skta interface ka sth ya to seald ho ga ya non selaed
    // sealed calss ka mqs jb ap chata ho ka kuch classes ko access dadin ka wo isko inherit kr ska baki ni to sealed clas use krta ha
    // selaed non sealed and final keyward with class that donot want to inhertit
    // sealed class ek aisi class hoti ha jiska inheritance control kia ja sakta ha
    // isme hum specify kr skte ha ki konsa class us class ko extend kr skta ha
    // iske liye hum sealed keyword ka use krte ha
    // aur uske baad hum specify krte ha ki konsa class us class ko extend kr skta ha
    // iske liye hum permits keyword ka use krte ha
    // aur uske baad hum specify krte ha ki konsa class us class ko extend kr skta ha

    // example

    // sealed class Shape permits Circle, Rectangle {
    //   void draw() {
    //     System.out.println("Drawing a shape");
    //   }
    // }

    // final class Circle extends Shape {
    //   void draw() {
    //     System.out.println("Drawing a circle");
    //   }
    // }

    // final class Rectangle extends Shape {
    //   void draw() {
    //     System.out.println("Drawing a rectangle");
    //   }
    // }


    B obj = new B();
    obj.display();
    obj.display1();
    C obj1= new C();
    obj1.display();
    obj1.display2();
    obj1.display1();
    
  }
}
