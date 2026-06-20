//sum of unique and sum of all elements in the list
import java.util.*;

public class problem15 {
    public static void main(String[] args) {
        List<Integer> l1 =List.of(1,2,3,4,32,2,5,6);
        Integer s1=l1.stream().distinct().reduce(0,Integer::sum);
        Integer s2=l1.stream().reduce(0,Integer::sum);
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
