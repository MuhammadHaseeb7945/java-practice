// abstract keyward wha use hota ha jdr hum na partial implementation krni hoti ha means ka method define krta ha lekn usko implement ni krta implement child class krti ha jesa car ek partial implemnet ha ab motorcar jeep jo implement kra ga wo full featuers implemnt kra ga
// abstract class ka undr hi abstract or public functions dono ho skta ha
// abstract method public class ma ni ho skta
// abstaract class ka object ni bna skta
abstract class A {
  abstract public void drive();// ab idr partial implementation ki and child class implenet kra gi
  public void playMusic(){
    System.out.println("Playing music");
  }  
}
class child extends  A{
  public void drive(){
   System.out.println("I am driving");
  }
}



public class Abstract_k {
  public static void main(String[] args) {
    A obj= new child();// lken abstract class ka reference us kr skta a lekn object ni bna skta
    obj.drive();
    obj.playMusic();
  }
}
