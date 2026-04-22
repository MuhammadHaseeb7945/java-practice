class Mobile {
  String name;
  int age;
  public Mobile(){
   name="Haseeb";
   age=20;  // this is default constructure and each time call when object is created
   System.out.println(name + " " + age);
  }
  public Mobile(int age,String name){
    this.age=age;
    this.name=name;
    System.out.println(name + " " + age);

  }  
}

public class Constructor {
  public static void main(String[]arg){
   Mobile obj=new Mobile();
   Mobile obj1=new Mobile(20,"Pass"); // parameterizd constructur

  }
}
