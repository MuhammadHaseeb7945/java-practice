public class Array {
  public static void main(String[]arg){

  // array multiple items elements ko ek simple variable ka undr store krna ka lia use hota ha
  // two types sa declare kr skta ha static and dynamic 
  // static ma size define kr deta ha jesa int arr[] = {1,2,3,4}
  // dynamic ma declrare krta ha array size bad ma define krta ha int arr [] = new int [5]
  int arr[] = {1,2,3,4};
  for (int i=0;i<4;i++){
    System.out.print(arr[i] + " ");
  }

  //dynamic
  int arr1[]=new int[3];
  arr1[0]=5;
  arr1[1]=6;

   for (int i=0;i<3;i++){
    System.out.print(arr1[i] + " ");
  }
  System.out.println();
  //Multi dimensional array means aray ka undr array hoti ha
  // int arr [kitni arrays ha ] [ kitna elemnts ha aray ka undr]
  int arr2 [][]={{1,2,3,4},{5,6,7,8},{9,10,11,14}};
    
  for (int i=0;i<3;i++){

    for (int j=0;j<4;j++){
      System.out.print(arr2[i][j] + " ");
    }
    System.out.println();
  }
// assigning random value using math library
int arr3[][]=new int[3][4];

  for (int i=0;i<3;i++){

    for (int j=0;j<4;j++){
      arr3[i][j]=(int)(Math.random()*10);  //runtime pr intitalizre randomly kia ha or by default ya doule value deta ha to is lia isko 100 sa multipy kra ka bari vlaue li or phir type casting ki
    }
    System.out.println();
  }

    for (int i=0;i<3;i++){

    for (int j=0;j<4;j++){
      System.out.print(arr3[i][j] + " ");
    }
    System.out.println();
  }

// new method of nested loop
for(int n[]:arr3){

  for(int m:n){
   System.out.print(m + " ");
  }
}

  }
}
