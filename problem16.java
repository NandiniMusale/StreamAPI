import java.util.Comparator;
import java.util.*;
public class problem16{
    public static void main(String[] args) {
        List<Integer> s1 =List.of(1,2,3,4,5,6,7,0,13);
       Integer ans= s1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
       System.out.println(ans);
      
    }

}