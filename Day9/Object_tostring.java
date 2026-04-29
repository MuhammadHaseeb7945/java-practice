 // java ma har class by defualt object class sa inherit krti ha or uska kuch methods bi hota ha jin ma to string ha equal bi ha equal by default address compare krta ha is lia apko usko override krna pra ga agr sii accurate value result chata ha
class A{
  int age;
  public A(int age){
   this.age=age;
  }
  public boolean equals(Object obj){
    A obj1= (A)obj;
    if(this.age==obj1.age){ // here this is the current object jis sa class ko call kia ha and obj1 as an argument dosra object pass kia ha ta ka usko current object sa compare kia ja ska
      return true;
    }
    else
      return false;
    
  }
 }
// so it will tell us that wheter the object is equal or not by comparing the content rather then comparing the references of the object
public class Object_tostring {
  public static void main(String[] args) {
    A obj=new A(10);
    A obj1=new A(11);
  //  System.out.println(obj==obj1); it will gives you flase reult because it is giving you comparision relsut based on the reference address so we will override the equal method
   System.out.println(obj.equals(obj1));
    

  }
}
