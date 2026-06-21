import java.util.*;

public class problem20{
    public static void main(String [] args){
        List<String> s1=List.of("anandi","nandini","rama","krishna");
        Optional<String> s2=s1.stream().sorted(Comparator.comparingInt(String::length).reversed()).skip(2).findFirst();
        System.out.println(s2);
    }
}