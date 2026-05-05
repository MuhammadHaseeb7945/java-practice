// annonation means suppliment to the compiler  sometimee hum compiler ka sth interact krna chata ha direct logic change ni krta , just extra information usko supply krta ha compile or runtime pr
// we are syaing that we are overriding this method if not override then it will show error
 class A{
public void display(){
  System.out.println("in a");
}

 }
 class B extends A{
   @Override  // this is annonation thats tell the compiler that we are overrding this method with someone so if its fails to override then it show the error becauase if we donotn use then logic error will occur and it is difficut to solve the logical error
 public void display(){
  System.out.println("in a");
}

 }

public class Annonation {
  public static void main(String[] args) {
    B obj=new B();
    obj.display();;


  }
}
