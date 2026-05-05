// enum stands for enumeration
// enum hmra pass fixed constant value ko store krna ka lia use hota ha 
//  enum ek class ha jis ka object jvm by default kud create krta ha inko new keyward sa bnana ki zroort ni ha
// constructur and variables private hota ha so getter and setter use krna prta ha
// if else ma . operatore sa acccess krka compare krna pra ga lekn switch ma ni

enum day{
  Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

}
enum laptop{
  Macbook(4000),Dell(15000),Hp(1300);
  private int price;
  private laptop(int price){
    this.price=price;
  }
  public int getter(){
    return price;
  }
  public void setter(int price){
    this.price=price;
  }

}

public interface Enum {
  public static void main(String[] args) {
    day value= day.Monday;
    System.out.println(value);

    laptop lap= laptop.Macbook;
    System.out.println(lap + " Price is "+ lap.getter());
    lap.setter(300);
    System.out.println(lap + " Price is "+ lap.getter());

    // Switch case
    laptop pc= laptop.Dell;
    switch (pc) {
      case Hp:
        System.out.println(pc + " Price is "+ pc.getter());
        break;
      case Dell:
        System.out.println(pc + " Price is "+ pc.getter());
        break;
      case Macbook:
        System.out.println(pc + " Price is "+ pc.getter());
      break;
    
      default:
        System.out.println("Enter valid");
        break;
    }

    // if statement
    laptop expense= laptop.Macbook;
    if(expense==laptop.Dell){
      System.out.println("Dell price is " + expense.getter());
    }
    else if (expense==laptop.Hp) {
      System.out.println("Hp price is " + expense.getter());
    }
    else  {
      System.out.println("Macbook price is " + expense.getter());
    }

  }
}
