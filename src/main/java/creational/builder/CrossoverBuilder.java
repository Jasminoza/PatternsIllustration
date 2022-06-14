package creational.builder;

public class CrossoverBuilder extends CarBuilder {
    @Override
    public void buildBody() {
        car.setBody(Body.CROSSOVER);
    }
    @Override
    public void buildModelName() {
        car.setModelName("BMW X3");
    }
    @Override
    public void buildPrice() {
        car.setPrice(45_000);
    }
}
