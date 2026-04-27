package day_7;

class parent{
 public void sum(){
  System.out.println("Parent class");

 }

}
class child extends parent{
  public void sum(){
  System.out.println("Child class");

 }


}




public class method_overriding {
  public static void main(String[] args) {
    // method overloading is used when we have same name of method but it have differnt arguments some takes no paraments but some take 2
    // sum()
    //sum(n1,n2)
    // method overloading
    // it is used when we have same method name and also same paremeters and the child method will override the method of parent class
    child obj=new child();
    obj.sum();
    // so if we want to call the parent class method then we can create the object of parent and can call the method sum() of parent


  }





}
