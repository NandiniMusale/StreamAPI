import java.util.*;
class problem26{
    public static void main(String[] args) {
        List<Integer> l1=List.of(1,2,3,4,5);
        List<Integer> l2=List.of(1,3,7,8,9);
        l1.stream().filter(l2::contains).forEach(System.out::println);

        
    }
}