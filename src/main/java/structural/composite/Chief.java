package structural.composite;

public class Chief implements Cook {

    @Override
    public void makeADish() {
        System.out.println("Chief cooking a dish...");
    }
}
