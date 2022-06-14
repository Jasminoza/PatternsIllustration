package creational.builder;

public class Director {
    CarBuilder builder;
    public void setCarBuilder(CarBuilder builder) {
        this.builder = builder;
    }
    public Car buildCar() {
        builder.createCar();
        builder.buildBody();
        builder.buildModelName();
        builder.buildPrice();

        Car car = builder.getCar();
        return car;
    }
}
