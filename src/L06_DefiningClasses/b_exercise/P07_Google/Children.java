package L06_DefiningClasses.b_exercise.P07_Google;

public class Children {
    String childName;
    String childBirthday;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }
    @Override
    public String toString(){
        return String.format("%s %s", this.childName, this.childBirthday);
    }
}
