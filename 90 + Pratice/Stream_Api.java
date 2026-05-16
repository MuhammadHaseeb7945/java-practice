import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

import javax.xml.crypto.Data;

public class Stream_Api {
  public static void main(String[] args) {
//     interview Line

// “Stream API is used to process collections in a functional and declarative way.”

// Short Notes Revision
// Concept	Meaning
// stream()	Collection ko stream me convert
// filter()	Condition apply
// map()	Data transform
// forEach()	Consume/output
// Lambda	Short anonymous function
// Stream is only one time useable
List<Integer> num= Arrays.asList(10,7,13,29);
// Stream<Integer> num1= num.stream();
// Stream <Integer> num2= num1.filter(n->n%2==0);
// // num2.forEach(n->System.out.println(n));
// Stream <Integer> num3=num2.map(n->n*2);
// num3.forEach(n->System.out.println(n));

int result= num.stream()
.filter(n->n%2!=0) // iski return type strem ha
.map(n->n*3)  // iski return type stream ha
.sorted()  // iski bi stream ha
.reduce(0,(c,e)->c+e);   // 0 initial value ha c current value, e next value ha or idr lamda expresiion ha
System.out.println(result);
List<String> num1= Arrays.asList("Haseeb","Ali","Ahmed");
Stream<String> name= num1.stream()
 .filter(n->n=="Haseeb")
 .map(n->n+ " Khaliq");
 
name.forEach(n->System.out.println(n));


// '
// num1=num.stream(){
//   .filter(n-> n%2==0);
//   .map(n->n*2);
//   .forEach(n->System.out.println(n));
// }

  }
}
