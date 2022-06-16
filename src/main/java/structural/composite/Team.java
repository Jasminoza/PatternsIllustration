package structural.composite;

import java.util.ArrayList;

public class Team implements Cook {
    ArrayList<Cook> team;

    public Team() {
        this.team = new ArrayList<>();
    }

    @Override
    public void makeADish() {
        for (Cook cook : team) {
            cook.makeADish();
        }
    }

    public void add(Cook cook) {
        team.add(cook);
    }


}
