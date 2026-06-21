
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class problem26 {
    public static void main(String[] args) {
        List<Employee> l1=List.of(
            new Employee("rama", 26),
            new Employee("krish", 26),
            new Employee("devi", 24),
            new Employee("veda", 20)
        );

        Map<Integer,List<Employee> >ans=l1.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(ans);
    }
}
