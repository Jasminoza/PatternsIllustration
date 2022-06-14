package creational.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new CrossoverBuilder());
        Car car = director.buildCar();

        System.out.println(car);
    }
}
