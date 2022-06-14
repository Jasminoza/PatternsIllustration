package creational.builder;

public class Car {
    private Body body;
    private String modelName;
    private int price;

    public void setBody(Body body) {
        this.body = body;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
