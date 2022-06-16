package structural.flyweight;

public class MensHairdresser implements Hairdresser {
    @Override
    public void makeHairstyle() {
        System.out.println("Doing haircut for some man...");
    }
}
