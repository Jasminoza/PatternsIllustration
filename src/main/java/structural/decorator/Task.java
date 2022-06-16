package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JuniorJavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
