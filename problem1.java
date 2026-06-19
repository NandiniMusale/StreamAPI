import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        List<Integer> l1 =List.of(1,2,3,4,5,6,6,7);
        List<Integer> ans =l1.stream().filter(n -> n%2==0).toList();
        System.out.println(ans);
    }
}
