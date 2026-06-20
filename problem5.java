import java.util.List;
import java.util.stream.Stream;

public class problem5 {
    public static void main(String[] args) {
        List<Integer> l1 =List.of(1,2,3,4,5,6);
        List<Integer> l2 =List.of(7,8,9,10);
        List<Integer> l3=Stream.concat(l1.stream(), l2.stream()).toList();
        System.out.println(l3);

    }
    
}
