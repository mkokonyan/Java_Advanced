package L06_DefiningClasses.a_lab.P02_Constructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car(String brand, String model, int horsePower) {
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsepower() {
        return this.horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsePower = horsepower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void carInfo() {
        System.out.printf("The car is: %s %s - %d HP.%n",
                this.getBrand(), this.getModel(), this.getHorsepower());
    }
}
