
//find the nth smallest element in the list
import java.util.*;
public class problem11 {
    public static void main(String[] args) {
        int n =4;
        List<Integer> l1 =List.of(1,2,3,3,7,9,4,5,6,7,8,9);
        Integer l2=l1.stream().distinct().sorted().skip(n-1).findFirst().orElse(0);
        System.out.println(l2);
    }
    
}
