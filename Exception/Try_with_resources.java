import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_with_resources {
  public static void main(String[] args) throws IOException{
    

    // try with resouces means ka hum na jo try ma resources open kia ha unko finally ma close krna agr exception occur ho ya na ho but we have to close it
    // means agr exception ka bwjood kuch exceute krna ho to usko final block ma put krna ha

    int j=0;
    int num=0;
    BufferedReader br=null; // ya bhir declare kia kuka scope limit ho gi thi
    try{

      br= new BufferedReader(new InputStreamReader(System.in));
      num= Integer.parseInt(br.readLine());
      j=18/num;
    }
    finally{
      System.out.println("Final Block");
      br.close();
      
    }
  }
}
