class A{
// private String name="haseeb";
//  public String show(){
//   return name;
//  }    so private ko return ka through dekh ya print kr skta ha
protected String name="Haseeb";
}
// class B {  sub class ma ap direct accss ni kr skta apko object bna kr access kr skta ha protected ko
//   A obj1=new A();
//   public void show(){
//  System.out.println(obj1.name);
  
//  } 
  // 
}

public class access_modifier {
  public static void main(String[] args) {
    B obj=new B();
    //obj.name="no"; private varibale ko outside update ni kr skta
    //System.out.print(obj.name); na hi access kr skta ha print ka lia to iska lia return lga skta ha
    // System.out.print(obj.show());
  //  System.out.print(obj.name);
  //  obj.name="no";

  obj.show();
  }
}
