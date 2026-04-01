class calculator{
  // overloading ma same name hota ha method ka lekn paramenters differnet hota ha
  // datatypes bi change ho skti ha 2 ya 3 ya 4 arguments bi ho skta ha
  public int add(int a,int b){
    return a+b;
  }
  public double add(double a,int b){ // isma datatype change ha
    return a+b;
  }
}
// methods kia hota ha , jb hum koi bi car bnata ha to sbsa pehla uska components bnata ha mean uski programming ka undr class bnata ha and ever class ka ek behaviour hota ha jis hum mehtod sa define krta ha 
//method overloading is the process in which we use the same name of functions but use differnt parameters jo usma pass krta ha 
public class methods_overloading {
  public static void main(String[]arg){
calculator obj= new calculator();
int result = obj.add(10, 20);
double result1 = obj.add(10.5, 20);
System.out.println(result);
System.out.println(result1);

  }
}
