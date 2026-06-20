//Sort the elements in Descending order

import java.util.Comparator;
import java.util.List;

public class problem10 {
    public static void main(String[] args) {
        List<Integer> s1=List.of(1,2,3,4,5,6);
        List<Integer> s2=s1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(s2);
    }
    
}
