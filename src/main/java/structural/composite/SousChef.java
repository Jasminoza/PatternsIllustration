package structural.composite;

public class SousChef implements Cook {
    @Override
    public void makeADish() {
        System.out.println("Sous-chef cooking sous...");
    }
}
