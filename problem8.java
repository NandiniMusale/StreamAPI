//Given a list of string find the strings which start with number

import java.util.List;

public class problem8 {
    public static void main(String[] args) {
        List<String> s1 = List.of("1nandini","2manoj","3rama","4sita","Arjun","krishna");
        List<String> s2=   s1.stream().filter(s -> Character.isDigit(s.charAt(0))).toList();
System.out.println(s2);
    }
    
}
