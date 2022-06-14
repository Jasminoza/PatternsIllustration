package creational.builder;

public class SedanBuilder extends CarBuilder {
    @Override
    public void buildBody() {
        car.setBody(Body.SEDAN);
    }
    @Override
    public void buildModelName() {
        car.setModelName("BMW 7");
    }
    @Override
    public void buildPrice() {
        car.setPrice(58_000);
    }
}
