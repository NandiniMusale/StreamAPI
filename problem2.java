import java.util.*;
import java.util.stream.Collectors;


public class problem2{
    public static void main(String[] args) {
        String s ="Java Stream API is the very intesting topic";
       String s1= Arrays.stream(s.split(" ")).map(s2 -> new StringBuilder(s2).reverse().toString()).collect(Collectors.joining(" "));
       System.out.println(s1);
    }
}