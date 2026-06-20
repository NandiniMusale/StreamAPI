import java.util.List;

public class problem7 {
    public static void main(String[] args) {
        List<Integer> l1 =List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> l2= l1.stream().filter(prime::primer).toList();
        System.out.println(l2);
    }
}
class prime{
    public static boolean primer(int a){
        if(a<2){
            return true;
        }
        else{
            int c=0;
            for(int i=2;i<=a;i++){
                if(a%i==0){
                    c=c+1;
                }
            }
            if(c>=2){
                return false;
            }
            else{
             return true;
            }
            
        }
    }
}