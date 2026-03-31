class Switch{
  public static void main (String[]arg){
  
    // Switch is used when we have multiple cases to match or check one variable against multiple values
    int day=2;
    switch(day){ // switch ka S capital rkhna ha // ab break statemnt lgyni ha kuka sb print krta ha
      case 1:
      System.out.println("Monday");
      break;
      case 2:
      System.out.println("Tuesday");
      break;
      case 3:
      System.out.println("Wednesday");
      break;
      case 4:
      System.out.println("Thurssday");
      break;
      case 5:
      System.out.println("Friday");
      break;
      case 6:
      System.out.println("Saturday");
      break;
      default:
        System.out.println("Please enter valid day");
    }
    

    // ATM Machine CODE Example
    String check="Balance";
    switch(check){
     case "Balance":
      System.out.print("Your Balance is " + 100);
      break;
     case "Widraw":
      System.out.print("Enter Ammount to Widraw"); 
     default:
      System.out.print("Invalid Options");
       

    }



  }
}
