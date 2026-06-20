//find the numbers starting with one


import java.util.List;

public class problem4 {
    public static void main(String[] args) {
        
    
    List<Integer> l1 =List.of(1,21,12,13,15,22,24);
    List<Integer> l2 =l1.stream().filter(s -> String.valueOf(s).startsWith("1", 0)).toList();
    
 System.out.println(l2);
}
}