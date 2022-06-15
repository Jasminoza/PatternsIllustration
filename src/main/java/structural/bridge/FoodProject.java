package structural.bridge;

public class FoodProject extends PhotoProject {

    public FoodProject(Photographer photographer) {
        super(photographer);
    }

    @Override
    protected void makeProject() {
        System.out.println("Food project in progress...");
        photographer.makePhotos();

    }
}
