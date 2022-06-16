package structural.composite;

public class Restaurant {
    public static void main(String[] args) {
        Team team = new Team();

        Cook firstCook = new Chief();
        Cook secondCook = new SousChef();
        Cook juniorCook = new JuniorCook();

        team.add(firstCook);
        team.add(secondCook);
        team.add(juniorCook);

        team.makeADish();
    }
}
