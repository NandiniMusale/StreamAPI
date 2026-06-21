import java.util.*;

public class problem28 {
    public static void main(String[] args) {
        List<Employee> l1=List.of(
            new Employee("ram", 25, 50000.0),
            new Employee("ram",24,5000000.0),
            new Employee("brida",25 , 600000.0)
     );
     l1.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).forEach(System.out::println);

    }
}
