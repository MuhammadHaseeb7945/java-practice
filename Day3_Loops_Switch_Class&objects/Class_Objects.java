class Car{   // class kisi bi cheez ka blueprint hota ha jesa real word ma ek car ka 
   // bue print bna lain then us sa cars manfuture krta rah same desig sa jo bi new banna ho
   //jis trh ap mobiel buy krta ho to then new mobile company manfacture krti ha same design
 String Car = "Blue";
 int Price = 100;
  
   public void product(String color){  // ya el ,ethod nya ha ma na
    if(color==Car){
      System.out.println("Car is available with price " + Price);
    }
   }
  public double add(int n, double m){
     return n+m;
  }

}

public class Class_Objects {
  public static void main (String[]arg){

    //sbsa pehla class ka object bnya jo design ko use kra ga 
Car obj = new Car();
String color="Blue";
obj.product(color);
double sum = obj.add(31,2.3);
System.out.print(sum);







  }
}
