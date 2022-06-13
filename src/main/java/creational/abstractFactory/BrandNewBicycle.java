package creational.abstractFactory;

import creational.abstractFactory.bicycle.BicycleAssembler;
import creational.abstractFactory.bicycle.BicycleEngineer;
import creational.abstractFactory.bicycle.BicycleFactoryTeam;
import creational.abstractFactory.bicycle.BicycleQualityTester;

public class BrandNewBicycle {
    public static void main(String[] args) {
        TeamFactory teamFactory = new BicycleFactoryTeam();
        Engineer engineer = teamFactory.getEngineer();
        Assembler assembler = teamFactory.getAssembler();
        QualityTester qualityTester = teamFactory.getQualityTester();

        System.out.println("Creating brand new bicycle...");
        engineer.developDevice();
        assembler.buildDevice();
        qualityTester.testDevice();
    }
}
