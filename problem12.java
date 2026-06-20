//find the last element in the array
import java.util.*;

public class problem12 {
    public static void main(String[] args) {
        List<Integer> l1 =List.of(1,2,3,4,5,6,7,8);
       Integer ans=l1.stream().distinct().skip(l1.size()-1).findFirst().orElse(0);
        System.out.println(ans);
        }

    
}
