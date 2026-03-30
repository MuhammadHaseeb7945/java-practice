class Conditional_statements{
  public static void main(String[]arg){
     int a=22;
    if(a<=20 && a>=5){
    System.out.println("nOW HAPPEN");
    }
    else{

      System.out.println("no Happen");
    }

   int x=10;
   int y=20;
   int z=30;
   //if(x>y){ // one statement ka lia curly ni chyia but multiple statements ka lia curly bracs chyia
   // System.out.println("x has maximum value");
   //}
   //else{
   // System.out.println("Y has maximum value");
   //}
  if(x>y && x>z){
    System.out.println(x);
  }
  else if(y>z){  // else if lgya ha  else if(y>x && y>z) isma upr x pehal compare ha to y>x ni krta time or resource save krna ha
    System.out.println(y);
  }
  else{
  System.out.println(z);
  }


  // Ternery operator java
  // isma hum if else ko short form ma likh skta ha 
  // ?:    left side question mark ka jo koi bi condition ha agr true to colon ka left side part exceute kro wrna colon ka right side part exceute kro

   int result2= x%2 == 0?22:30;
   System.out.println("Ternery Operator");
   System.out.println(result2);

  }
}