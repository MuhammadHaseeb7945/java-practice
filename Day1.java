class Day1{
  // public means accessable from anywhere , it is main so exceution start from here  , void means return nothing , so it is signature without this java code will not run
  public static void main(String arg[]){
  // System.out.print("Hellow");
  //Data types
  short num3=10;// 2 byte
   int num=10; //4 byte 2e4
   long num4=12; // 8 btye 2e8
   double num1=20.0; //8 byte 2e8
   float num2=20.1f;  // 4 byte 2e4
   char name='a';   // 2 byte
System.out.println(num);
System.out.println(num1);
System.out.println(num2);
System.out.println(name);
System.out.println(num3);
System.out.println(num4);
  int hexa=0xA010;  // hexadecimal store
  System.out.println(hexa);
  int binary=0b010; // binary number store 
  System.out.println(binary);
  int octal=012;
  System.out.println(octal); //octall number store
  boolean boolen=true;
  System.out.println(boolen); //1bit

  }
}