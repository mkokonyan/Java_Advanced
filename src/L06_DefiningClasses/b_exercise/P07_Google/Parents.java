package L06_DefiningClasses.b_exercise.P07_Google;

public class Parents {
    String parentName;
    String parentBirthday;

    public Parents (String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }
    @Override
    public String toString(){
        return String.format("%s %s", this.parentName, this.parentBirthday);
    }
}
