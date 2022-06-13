package creational.abstractFactory.scooter;

import creational.abstractFactory.Engineer;

public class ScooterEngineer implements Engineer {
    @Override
    public void developDevice() {
        System.out.println("Developing a scooter...");
    }
}
