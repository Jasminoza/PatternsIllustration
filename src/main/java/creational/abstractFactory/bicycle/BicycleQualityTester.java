package creational.abstractFactory.bicycle;

import creational.abstractFactory.QualityTester;

public class BicycleQualityTester implements QualityTester {
    @Override
    public void testDevice() {
        System.out.println("Testing bicycle quality...");
    }
}
