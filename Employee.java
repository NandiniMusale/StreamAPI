class Employee{
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age,double salary) {
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
    

    
}