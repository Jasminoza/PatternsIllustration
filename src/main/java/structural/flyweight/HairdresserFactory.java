package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class HairdresserFactory {
    private Map<String, Hairdresser> hairdressers = new HashMap<>();

    public Hairdresser getHairdresserByClientsGender(String clientsGender) {
        if (hairdressers.get(clientsGender) == null) {
            switch (clientsGender) {
                case "male" -> {
                    System.out.println("Hiring mens hairdresser...");
                    hairdressers.put(clientsGender, new MensHairdresser());
                }
                case "female" -> {
                    System.out.println("Hiring woman hairdresser...");
                    hairdressers.put(clientsGender, new WomenHairdresser());
                }
            }
        }
        return hairdressers.get(clientsGender);
    }
}
