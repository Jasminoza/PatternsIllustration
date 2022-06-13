package creational.abstractFactory.bicycle;

import creational.abstractFactory.Engineer;

public class BicycleEngineer implements Engineer {
    @Override
    public void developDevice() {
        System.out.println("Developing a bicycle....");
    }
}
