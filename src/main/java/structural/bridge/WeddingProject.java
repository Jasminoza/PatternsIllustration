package structural.bridge;

public class WeddingProject extends PhotoProject {

    public WeddingProject(Photographer photographer) {
        super(photographer);
    }

    @Override
    protected void makeProject() {
        System.out.println("Wedding project in progress...");
        photographer.makePhotos();
    }
}
