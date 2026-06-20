//Add a "[" as prefix ,"]" as suffix and "," delimiter for each word in String Array
import java.util.List;
public class problem13 {
    public static void main(String[] args) {
        
    
    List<String> s1=List.of("anandi","rama","krishna");
    List<String> s2=s1.stream().map(s-> "["+s+"]").toList();
    System.out.println(s2);
    }
    
}
