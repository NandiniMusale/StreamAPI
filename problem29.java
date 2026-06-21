import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class problem29 {
    //find the longest string in a list of strings
    public static void main(String [] args){
    List<String> s1 =List.of("Rama","sita","laxman","urmila","Ramayana");
     String ans=s1.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
     System.out.println(ans);
    }

}
