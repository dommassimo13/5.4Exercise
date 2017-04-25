/**
 * Created by dominicmassimo on 4/24/17.
 */
public class Car {
    private String color;
    private int horsepower;
    private double enginesize;
    private String make;
    private static int count;

    public Car() {
        color = "grey";
        horsepower = 200;
        enginesize = 1.8;
        make = "Ford";
        count++;
    }

    public Car(String color, int horsepower, double enginesize, String make) {
        this.color = color;
        this.horsepower = horsepower;
        this.enginesize = enginesize;
        this.make = make;
        count++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(double enginesize) {
        this.enginesize = enginesize;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static int getCount() {
        return count;
    }

    public boolean equals(Car car){
        return this.color.equals(car.color) && this.horsepower == (car.horsepower) && this.enginesize == car.enginesize && car.make.equals(car.make);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", horsepower=" + horsepower +
                ", enginesize=" + enginesize +
                ", make='" + make + '\'' +
                '}';
    }
}