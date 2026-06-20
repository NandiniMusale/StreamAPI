import java.util.stream.Stream;
import java.util.*;
public class problem9 {

    public static void main(String[] args) {
        String s1="laval";
        String s2="nandini";
       List<String> l1 =List.of(s2);
       List<String> l2=List.of(s1);
       
   boolean b1=    l1.stream().anyMatch(s -> new StringBuilder(s).reverse().toString().equals(s));
      System.out.println(b1);
      boolean b2 =l2.stream().anyMatch( s -> s.equals(new StringBuilder().reverse().toString()));
 System.out.println(b2);   
}
}
