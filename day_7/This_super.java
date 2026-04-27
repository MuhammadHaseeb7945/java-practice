package day_7;
class A{
   String name="non2";
     public A(){
    System.out.println("Default constructor A");

     }
     

     public A(int n1,int n2){
      System.out.println("Paremeterized constructor A" + n1 + " "+ n2 );
    
     }

}
class B extends A{
   
     public B(){
     System.out.println("Default constructor B");
    // super(1,2);  // call the default and parent parameterized constructuir


     }
    public B(int n1,int n2){
      this();// it is used to call the another consturcor in the same class
      System.out.println("Paremeterized constructor B" + n1 + " "+ n2 );
    // super();  it will call the default constructor of parent class
    
    }



}




public class This_super {
  
public static void main(String[]arg){
    // this and super method in java
    // this method tb use hota ha jb hum na uska agr parameterize constructur ho to default constructure ko call krna hota ha 
    // super method is used to call the constructue of super/ parent class

    // B obj = new B(); when ther is defualt constructur then it will call the constructor of child class which we are creaating the object and also its parent class
    //B obj = new B();
    // also when we pass the super method in default constructor of child class which we are creating the object then super(1,2) it will call the parameterized constrructor of parent class without calling the default constructor
   // B obj = new B(1,3);
     
    B obj = new B(1,3);



}

}
