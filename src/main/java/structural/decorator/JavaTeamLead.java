package structural.decorator;

public class JavaTeamLead extends JavaDeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + "Making very important job...";
    }
}
