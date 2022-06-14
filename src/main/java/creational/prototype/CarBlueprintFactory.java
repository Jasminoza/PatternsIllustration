package creational.prototype;

import creational.builder.Car;

public class CarBlueprintFactory {
    CarBlueprint carBlueprint;

    public CarBlueprintFactory(CarBlueprint carBlueprint) {
        this.carBlueprint = carBlueprint;
    }

    public CarBlueprint cloneCarBlueprint() {
        return (CarBlueprint) carBlueprint.copy();
    }
}
