class Fake{
  public void display(){
    System.out.println("Fake class");
  }
}

public class InnerAnonymous {
  public static void main(String[] args) {
    Fake obj = new Fake(){
      public void display(){
        System.out.println("i am anonmyous"); // this is inner anonymous class and ya us time use ki jati ha jb ine time use krna ho
      }
    };
    obj.display();
  }
}
