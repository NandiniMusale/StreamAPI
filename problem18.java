import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class problem18{
    public static void main(String[] args) {
        String s ="java is the most used language in webdevelopment";
        s.chars().mapToObj(s2 -> (char)s2).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(k -> k.getValue()==1).map(m-> m.getKey()).findFirst().ifPresent(System.out::println);

   
    
    }
    
}