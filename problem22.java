import java.util.*;
//print the duplicate elements
//check if we have any duplicate elemensts
public class problem22 {
    public static void main(String[] args) {
        List<Integer> s1=List.of(1,2,2,3,4,5);
        Set<Integer> s2=new HashSet<>();
        s1.stream().filter(n -> !s2.add(n)).forEach(System.out::println);
        //boolean hasduplicate =s1.stream().anyMatch(s -> !s2.add(s));
        //System.out.println(hasduplicate);
    }
}
