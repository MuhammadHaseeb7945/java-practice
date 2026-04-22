class Human{
  private String name="Haseeb";
  private int ammount=100;

  // public void show(){
  //   System.out.println(name + " is " + ammount);
  // }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAmmount() {
    return ammount;
  }

  public void setAmmount(int ammount) {
    this.ammount = ammount;
  }
}


public class encapsulation {

  public static void main(String[]arg){
  
    // encapsualtion ka mtlb ha apna coe ko unauthorized user sa bachna jis trh capsule hota ha jo powder ko out environemnt sa bchata ha isi trh apna code ko private bnana or getter or setter methodsa outside class access krna
   Human obj=new Human();
  //  obj.show();
  System.out.println(obj.getAmmount());
  System.out.println(obj.getName());
  obj.setAmmount(20);
  obj.setName("ali");

  System.out.println(obj.getAmmount());
  System.out.println(obj.getName());

  

  }
}
