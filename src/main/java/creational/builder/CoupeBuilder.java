package creational.builder;

public class CoupeBuilder extends CarBuilder {
    @Override
    public void buildBody() {
        car.setBody(Body.COUPE);
    }

    @Override
    public void buildModelName() {
        car.setModelName("BMW 2");
    }

    @Override
    public void buildPrice() {
        car.setPrice(30_000);
    }
}
