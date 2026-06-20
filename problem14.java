//sum of first two numbers in the list
import java.util.*;

public class problem14 {
    public static void main(String[] args) {
        List<Integer> l1 =List.of(1,2,3,4,5,6,7);
        Integer ans =l1.stream().limit(2).reduce(0,Integer::sum);
        System.out.println(ans);

        
    }
}
