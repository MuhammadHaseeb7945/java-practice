public class string {
  
  public static void main (String[]arg){


    String name="Haseeb";
    name=name + "ali";
    System.out.println(name);
    // so jab bi hum string declrare krta ha to ny default ya ek class ha premitie datatype ni ha is lia stack ma name reference variable create hoga then uska jo address hoga wo hea ma point kr rha hoga ab heap ma string constant pool create hoga jiska mqsd ha string agr ek bar jesa aseeb store howa dobara haseeb ko store krain to wo pool ma ek bar store ho ta ka memory efficently use ho
    

    //Aapko lag raha hai ke "Haseeb" wala object hi bada ho kar "Haseebali" ban gaya. Lekin aisa nahi hota.Java SCP mein ek naya object banata hai: "Haseebali".Purana object "Haseeb" waisa hi rehta hai (wo change nahi hota, isi ko Immutability kehte hain).Ab name variable purane address ko chor kar naye object "Haseebali" ke address ko point karne lagta hai.

    String s1="ali";
    String s2="ali";
    System.out.println(s1==s2);

    // so immutablility ko solve krna ka lia hmra pass Stringbuffer ka solution ata ha jis sa hmra pass garbage value ni collect hoti mean jb hum ko bi value update krta ha to purani value khtm ho jati ha uski jga updated value a jati ha jis sa memory optimization hpti ha so buffer ki capacity 16 byte hoti ha jb new value store krta ha to append ho jata ha new size then 16 byte is lia reht ha future ma jb value update krain to space reallociate ho jati ha usko 
    StringBuffer s= new StringBuffer("Haseeb");
    System.out.println(s);
    System.out.println(s.capacity());
    System.out.println(s.charAt(3));
    s.delete(0, 5);
    //s.replace(0, 2, "ali");
    System.out.println(s);
    System.out.println(s.capacity());
    System.out.println(s.charAt(0));

    //Ye "Seen" Kya Hai? (The Logic)
//Java ka logic ye hai ke agar aapne ek baar 22 characters ki jagah le li hai, toh characters delete karne par wo us jagah ko wapis OS (Operating System) ko nahi deta.

//Kyun? Kyunke computer science mein memory allocate karna ek "mehnga" (slow) kaam hai. Java sochta hai: "Ho sakta hai user ne abhi characters delete kiye hain, lekin thori der baad wo phir se kuch bada append (add) kar de. Agar main abhi jagah kam kar doon aur phir naye characters aayein, toh mujhe dobara mehnat karni paregi naya space dhundne mein."

  }
}
