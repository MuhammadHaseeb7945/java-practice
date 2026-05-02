//Agar method override hai → child (anonymous) chalegi ✅
//Agar override nahi hai → parent (A) chalegi
// is class ka koi name ni hota

class A{

  public void display(){
    System.out.println("i am outer class");

  }
  public void show(){
    System.out.println("i am outer show class");

  }
}
public class Anonymous_class {
  public static void main(String[] args) {
 A obj=new A(){ // idr terminator ni lgna wrna anonmyous class i ho gi
   public void show(){
    System.err.println("I am anonmyous class");
   }


 };
 obj.show(); // ya lazmi call krna ha wrna ya override ni ho ga ab show parent ko overirdre kra ga
 obj.display();// display override ni kra ga

  }
}
