import java.util.*;
public class problem24{
    public static void main(String [] args){
        List<Integer> l1 =List.of(2,4,6,8,9,0,1);
       Integer ans= l1.stream().filter(n -> n%2!=0).findFirst().orElse(0);
       System.out.println(ans);
    }
}