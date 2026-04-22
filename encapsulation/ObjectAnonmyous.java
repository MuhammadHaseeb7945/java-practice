class Laptop {
 String name ="Haeeb";
 int age=21;
  public Laptop(){
    System.out.println("i am in constructur");
  }
 public void show(){
  System.out.println(name + " " + age);}
 
}

public class ObjectAnonmyous {
  public static void main(String[] args) {
    new Laptop().show(); // this is anomymonous means object to create hogia ab usko hum na kisi variable ko assign ni kia to ya reuseable ni hoga future ma so thats why its call anonymonous object jis ka reference variable koi ni hota 



  }
}
