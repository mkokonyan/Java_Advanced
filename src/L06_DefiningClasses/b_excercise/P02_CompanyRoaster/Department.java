package L06_DefiningClasses.b_excercise.P02_CompanyRoaster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees;
    private String name;

    public Department (String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public String getName() {
        return this.name;
    }

    public double calculateAverageSalary() {
        return this.employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

}
