//this is example for constructor

public class Employee {
    String name;
    String dept;
    int id;

    public Employee(String name,String dept,int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee e = new Employee("John","IT",123);

        System.out.println(e.id + " " + e.name +" " + e.dept);
    }
}
