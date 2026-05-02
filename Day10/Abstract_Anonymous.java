abstract class Mobile{
  abstract public void display();
}



public class Abstract_Anonymous {
  public static void main(String[] args) {
    Mobile obj= new Mobile() { // anonymous class bnata hi uska object bna dia is trh abstract class use kr skta ha
      public void display(){
        System.out.println("Abstract plus inner class");
      }
      
    };
    obj.display();


// Abstract class ka object direct nahi banta
// Anonymous class bana ke bana sakte hain
// Abstract method ko override karna must hai
// One-time use ke liye best
  }
}
