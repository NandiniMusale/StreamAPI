//Count of each character in the String
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class problem23 {
    public static void main(String[] args) {
        String s="java is the most interesting language to learn";
    Map<Character,Long>ans=s.chars().mapToObj(ch -> (char)ch).filter(n -> n!=' ').collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
  System.out.println(ans);
    }

}
