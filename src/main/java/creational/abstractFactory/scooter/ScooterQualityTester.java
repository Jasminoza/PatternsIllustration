package creational.abstractFactory.scooter;

import creational.abstractFactory.QualityTester;

public class ScooterQualityTester implements QualityTester {
    @Override
    public void testDevice() {
        System.out.println("Testing scooter quality...");
    }
}
