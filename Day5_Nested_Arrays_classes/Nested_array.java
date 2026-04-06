public class Nested_array {
 public static void main (String []arg){
  
  int arr1[][]=new int [3][];
  // jagged arays in which rows fix htoi ha lekn columsn size change hota ha
  arr1[0]= new int[5];
  arr1[1]= new int[1];
  arr1[2]= new int[3];
  //row ka undr new array hoti ha



  for (int i=0;i<arr1.length;i++){

    for(int j=0;j<arr1[i].length;j++){  // arr1[i].length ya btata ha ka inner kitni columns ha wrna outer total bta deta ha
      arr1[i][j]=(int)(Math.random()*100);

    }
  }
  //for printing
  for (int i=0;i<arr1.length;i++){

    for(int j=0;j<arr1[i].length;j++){
      System.out.print(arr1[i][j] + " ");
    }
    System.out.println();
  }


 } 
}
