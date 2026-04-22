class Animal{
 String feed="Grass";
 String Type="Hybrid";
 public Animal(){

 }
  public Animal(String feed, String Type){
    this.feed=feed;
    this.Type=Type;
  }

}
class Cow  extends Animal{
String milk="20kg";
 public void show(){
  System.out.println("Cow which is " + Type + " eat " + feed + " gives " + milk + " milk");
 }
  
}

public class Inheritance {
  public static void main(String[] args) {
    Animal obj= new Animal("meat","new");
    Cow obj1= new Cow();
    obj1.show();



  }
}
