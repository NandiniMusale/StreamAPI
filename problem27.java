//partition list of elements into group of even and odd numbers
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class problem27 {
    public static void main(String[] args) {
        List<Integer> l1=List.of(1,2,3,4,5,6,7,8);
        Map<Boolean,List<Integer>> ans=l1.stream().collect(Collectors.partitioningBy(n -> n%2 ==0));
   System.out.println(ans);
        
    }
}
