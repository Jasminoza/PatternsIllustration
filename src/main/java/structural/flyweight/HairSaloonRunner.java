package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class HairSaloonRunner {
    public static void main(String[] args) {
        HairdresserFactory hairdresserFactory = new HairdresserFactory();
        List<Hairdresser> hairdressers = new ArrayList<>();

        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("male"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("male"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("male"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("male"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));
        hairdressers.add(hairdresserFactory.getHairdresserByClientsGender("female"));

        for (Hairdresser hairdresser : hairdressers) {
            hairdresser.makeHairstyle();
        }

    }
}
