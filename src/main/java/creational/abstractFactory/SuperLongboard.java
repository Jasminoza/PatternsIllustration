package creational.abstractFactory;

import creational.abstractFactory.bicycle.BicycleFactoryTeam;
import creational.abstractFactory.scooter.ScooterTeamFactory;

public class SuperLongboard {
    public static void main(String[] args) {
        TeamFactory teamFactory = new ScooterTeamFactory();
        Engineer engineer = teamFactory.getEngineer();
        Assembler assembler = teamFactory.getAssembler();
        QualityTester qualityTester = teamFactory.getQualityTester();

        System.out.println("Creating super longboard...");
        engineer.developDevice();
        assembler.buildDevice();
        qualityTester.testDevice();
    }
}
