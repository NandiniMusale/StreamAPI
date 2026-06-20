
// remove duplicated and preserve order
import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;
public class problem3 {
public static void main(String[] args) {
    List<Integer> l1 = List.of(1,2,3,3,4,2,5,6);
    //List<Integer> l2 = l1.stream().distinct().toList();
    //System.out.println(l2);
    //remove dupliactes with any order
   Set<Integer> an=l1.stream().collect(Collectors.toSet());
System.out.println(an);
    
}
}
