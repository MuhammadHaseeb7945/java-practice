import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_Buffer {
  


  public static void main(String[] args) throws IOException{
    
    // Buffer fast hota ha scanner sa but complex hota ha parsing bi krni prti a
    InputStreamReader string = new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(string);
    int num= Integer.parseInt(br.readLine());
    System.out.println(num);
    // so ya srif integer ka lia use hota ha upr jo code ha or isr wrapper classs use ki ha Integer wali then next scanner ha usko try krta ha
    System.out.println("Enter scanner");
    Scanner sc= new Scanner(System.in);
    int num2= sc.nextInt();
    System.out.println(num2);
   // scanner bht zyda slow  ha or easy bi ha
   // buffer fast ha but complex ha

  }
}
