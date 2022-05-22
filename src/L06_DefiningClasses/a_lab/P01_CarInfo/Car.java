package L06_DefiningClasses.a_lab.P01_CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void carInfo() {
        System.out.printf("The car is: %s %s - %d HP.%n",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }
}
