package structural.bridge;

public abstract class PhotoProject {
    protected Photographer photographer;
    protected PhotoProject(Photographer photographer) {
        this.photographer = photographer;
    }
    protected abstract void makeProject();
}
