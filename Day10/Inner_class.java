// inner class means class inside class
//it makes encapsulation strong
// it can bi local anonymonous and static


class A{
   public void display(){
  System.out.println("i am outer class");
   }
   class B{
    public void show(){
    System.out.println("i am inner class");}
   }
   static class C{
    public void show(){
    System.out.println("i am static class");}
   }
  
}

public class Inner_class {
  public static void main(String[] args) {
    A obj= new A();  // pehla outer ka object bnya ha
    obj.display();
    A.B obj2= obj.new B(); //then outer ka object sa inner class ka new object bnya ha
    obj2.show();
    A.C obj3= new A.C(); // static class implemnt ki ha means sb object ka li asam evalue rha gi 
     obj3.show();


  }
}
