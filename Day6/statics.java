class Mobile{
int price;
String model;
static String name="Samsung";


 public void show(){
  System.out.println("Model " + model + name + price);
  //non static function ka undr ap static or non staic instance variable use kr skta ho but static function ka undr srf ap static variable use kr skta ho instance variable ni 
 }
 static public void show1(Mobile obj){
  System.out.println("Model " + obj.model + name + obj.price);
  // to isl lia indirectly hum usko object pass kr ka kr skta ha
}
}



public class statics {

  public static void main(String[]arg ){
  Mobile obj1=new Mobile();
  obj1.price=200;
  obj1.model="2019";
  Mobile obj2=new Mobile();
  obj2.price=400;
  obj2.model="2020";
  obj1.show();
  obj2.show();
  //Java mein iska rule bada simple hai:

//Instance Method: Yeh static aur non-static dono variables ko access kar sakta hai. (Jaise aapne show() method mein kiya).

//static Method: Yeh sirf static variables ko access kar sakta hai. Yeh instance variables (jaise price ya model) ko access nahi kar sakta kyunke static method ko nahi pata hota ke wo kis object ki baat kar raha hai.
//Mobile.show(); instance function ko direct class name sa call ni kr skta lekn static ko hum call kr skta ha 
// ek or cheez ka static ma fix memory allocate kr di jati ha
Mobile.show1(obj1);




  }
}