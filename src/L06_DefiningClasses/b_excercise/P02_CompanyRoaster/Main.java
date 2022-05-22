package L06_DefiningClasses.b_excercise.P02_CompanyRoaster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new HashMap<>();
        for (int i = 0; i < numberOfEmployees; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee;
            if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else {
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }
            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);

        }
        Department highestPaidDepartment = departments
                .entrySet()
                .stream()
                .max(Comparator.comparing(entry -> entry.getValue().calculateAverageSalary()))
                .get()
                .getValue();
        System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());
        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);


    }
}
