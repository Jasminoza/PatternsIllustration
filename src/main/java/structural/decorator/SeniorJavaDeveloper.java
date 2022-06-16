package structural.decorator;

public class SeniorJavaDeveloper extends JavaDeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + "Creating project structure...";
    }
}
