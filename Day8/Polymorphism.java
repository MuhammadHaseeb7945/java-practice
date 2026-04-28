// polymorphism ka mtlb ha ka poly means many and morphism means behaviour so it has two types one is compile time polymorphism which is  function overloading and the second is a runtime polymorphism which is a function overriding 
// funstion overloading means same function names but different parameters and function overriding means same function names and parameters but the child class ethod override the method of paraent class
// now we will see here the dynamic dispatch which is the runtime polymorphism which is function overriding 

class Parent{
String name= "Haseeb";
int age = 22;

}
class Child extends Parent{
 String name= "Muhammad";
int age = 23;

}




public interface Polymorphism {
  public static void main(String[]arg){
    Parent obj= new Child();
    // object child ka bna kr parent ka refernce use kr rha ha isko up casting bi kehta ha
    System.out.println(obj.name);
    Child obj1= (Child)obj;// this is down casting jis ma parent ko child ma convert kr rha ha means ka child ka refernece pr aprent ko store kr rha a
    System.out.println(obj1.name);


  }
}
