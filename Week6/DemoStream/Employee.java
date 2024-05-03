package Week6.DemoStream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
  private String name;
  private String department; // enum
  private double salary;

  public Employee(String name, String department,double salary){
    this.name = name;
    this.department = department;
    this.salary =salary;
  }

  public String getDepartment(){
    return this.department;
  }

  public double getSalary(){
    return this.salary;
  }
  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", "HR", 60000));
    employees.add(new Employee("Bob", "IT", 45000));
    employees.add(new Employee("Carol", "Finance", 75000));
    employees.add(new Employee("David", "HR", 48000));
    employees.add(new Employee("Jenny", "IT", 60000));

    List<String> result = employees.stream()//
    .filter(e -> e.getSalary() >= 60000 && "IT".equals(e.getDepartment()))
    .map(e -> e.getName())
    .collect(Collectors.toList());

    System.out.println(result);
    
    //Stream
    //1. filer salary >= 60000 and department = "IT"
    //2. map the name of th result set to a list of String
    
  }
}
