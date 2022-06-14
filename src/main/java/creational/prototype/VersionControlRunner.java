package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        CarBlueprint masterBlueprint = new CarBlueprint(42341, "BMW X8", "Brand new crossover");
        CarBlueprintFactory carBlueprintFactory = new CarBlueprintFactory(masterBlueprint);

        CarBlueprint masterClone = carBlueprintFactory.cloneCarBlueprint();

        System.out.println(masterBlueprint);
        System.out.println("\n=========================\n");
        System.out.println(masterClone);
        System.out.println(masterBlueprint == masterClone);
    }
}
