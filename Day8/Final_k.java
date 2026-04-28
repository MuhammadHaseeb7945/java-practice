// Final keyward is used when you want to make something constant just like in other languages 
// agr variable ko final kr dia to dobara usko change ni kr skta value ko
// sometimes aesa hota ha ka ap koi bi module bnata ho or usko public ma publish kr deta ho to next agr koi bi bnda aya or apka work ya module ko inhert kra override kra or usko change krka apan likh da to apka credit to gya is lia ap udr final keyward bi lga skta ho
class Calculator{
  final public void show(){
  System.out.println("Pulish by haseeb");
  } // so jb idr final lgya ga to sub class isko over ride ni kr ska gi 
}
class Calculator2 extends Calculator{
  public void show(){
  System.out.println("Pulish by Alladin");
  }
}


public class Final_k {
  public static void main(String[] args) {
    final String name="Haseeb";
    
    // name="hello";
   Calculator2 obj= new Calculator2();
   obj.show();

  }
}
