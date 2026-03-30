class Logical_operators{
public static void main (String[]arg){
  //in this operators we have short circuit opertors also means ka pehli condition check hoti ha , dosri ni hoti. us time jb pehli false ho tb.
  // logical and (&&) and logical or(||)
  int a=10;
  int b=20;
  int c=30;
  int d=40;
  boolean result= a<b && c > d;  //short circuit operators // and operator agr pehli false then result false ha
  System.out.println("ShortCircuit");
  System.out.println(result);
  
  boolean result1= a<b || c > d;   // or operator agr pehla true ha to result ture ho ga short circuit
  System.out.println(result1);
  boolean resu=a>b;
  System.out.println(!resu);  // not operators

  boolean log = a>b & a<c; // both conditions will checked
  System.out.println(log);
}

}