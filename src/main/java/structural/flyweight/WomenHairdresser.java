package structural.flyweight;

public class WomenHairdresser implements Hairdresser {
    @Override
    public void makeHairstyle() {
        System.out.println("Doing haircut for some woman...");
    }
}
