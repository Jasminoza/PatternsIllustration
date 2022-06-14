package creational.builder;

public abstract class CarBuilder {
    Car car;
    public void createCar() {
        car = new Car();
    }
    public abstract void buildBody();
    public abstract void buildModelName();
    public abstract void buildPrice();

    @Override
    public String toString() {
        return "CarBuilder{" +
                "car=" + car +
                '}';
    }

    public Car getCar() {
        return car;
    }
}
