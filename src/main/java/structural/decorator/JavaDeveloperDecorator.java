package structural.decorator;

public class JavaDeveloperDecorator implements Developer {
    Developer developer;
    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
