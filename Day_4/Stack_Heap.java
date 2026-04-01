class Calculator{

    int a=10; // ya instance variable ha
   public int add(int a,int b){
    return a+b;
   }
}



public class Stack_Heap {
  public static void main(String[]arg){


    int a=10; // ya main method ma ha to main stack ma jia ga
  // jb stack create hoga memory ka undr to main ka stack hoga usma main ka undr jo variable declerae howa ha a=10 wo aya ga then result ayaa ga mgr what about obj jo ka reference varable ha also and class jo bnyi ha uska undr int a=10 lia ha wo kdr jia ga wo jia ga heap k undr also function calling bi heap ma jia gi.
  //instance variale jia ga mgr heap ma object jia ga jo refernce variable obj ha wo stack ma hoga main jo heap ka undr address jesa object ka 101 ha usko refer kr rha hoga
     Calculator obj  = new Calculator();;
     int result = obj.add(10, 5);
     //add method ka lia bi separate stack create ho ga jis ma in variable 10 5 ki value jia gi

    Calculator obj1 = new Calculator();
    obj1.add(10, 5);

  }
}
