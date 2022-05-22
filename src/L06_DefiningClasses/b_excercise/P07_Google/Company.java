package L06_DefiningClasses.b_excercise.P07_Google;

public class Company {
    String companyName;
    String department;
    double salary;

    public Company (String companyName, String department, double salary){
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("%s %s %.2f", this.companyName, this.department, this.salary);
    }
}
