import java.util.*;
public class problem17 {
    public static void main(String [] args){
        List<String> l1 =List.of("nandini","hsgsg","aaa");
        vowels obj =new vowels();
        List<String> ans =l1.stream().filter(s -> obj.kvowels(s)==3).toList();
        System.out.println(ans);

    }

}
class vowels{
    public int kvowels(String s){
        char [] a =s.toCharArray();
         String s1="aeipuAEIOU";
        int c=0;
        for(char i: a){
            if(s1.contains(String.valueOf(i))){
                c=c+1;
            }
        }
        return c;
    }
}
