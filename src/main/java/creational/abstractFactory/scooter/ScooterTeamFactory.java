package creational.abstractFactory.scooter;

import creational.abstractFactory.Assembler;
import creational.abstractFactory.Engineer;
import creational.abstractFactory.QualityTester;
import creational.abstractFactory.TeamFactory;

public class ScooterTeamFactory implements TeamFactory {
    @Override
    public Assembler getAssembler() {
        return new ScooterAssembler();
    }

    @Override
    public Engineer getEngineer() {
        return new ScooterEngineer();
    }

    @Override
    public QualityTester getQualityTester() {
        return new ScooterQualityTester();
    }
}
