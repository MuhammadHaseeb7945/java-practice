package Day2_Type_Conversion_Casting;
class Day2{
  public static void main (String[]arg){
  //Type Conversion : The java convert the small type  to big type 
  //There is no loss of data and you have no control over it
  //byte>short>int>long>float>double
  //1byte>2byte>4byte>8byte>4byte>8byte    //1 byte=2e8 store number
  byte a=10;
  short b=a;    //byte to short
  int c;         
  c=b;          //short to int
  long d=c;     //int to long
  
  float e=d;    //long to float
  double f=e;   // float to double

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
   System.out.println(e);
   System.out.println(f);


   // Type Casting:
   // In which you have to do explicity conversion
   //Often result in the loss of data when convert float or double to int or int to byte
  // double to int 10.5 to 10
   int cast1=300;
   byte bt=(byte)cast1;   // datatype ko bracket ma likna ha   300/256   1byte=8bits 2power8 =256 +127 -127
   System.out.println("this is");  // integer ko byte ma kia ha
  System.out.println(bt);
   double cust=10.1;   // double to int point losses so issue in deep thinking
   int cust2=(int)cust;  // double to integer
   byte cust3=(byte)cust2;
  System.out.println(cust2);
 System.out.println(cust3);
 char cust4=(char)cust2;
 System.out.println(cust4);

  }
}