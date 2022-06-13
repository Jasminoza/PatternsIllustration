package creational.abstractFactory.bicycle;

import creational.abstractFactory.Assembler;
import creational.abstractFactory.Engineer;
import creational.abstractFactory.QualityTester;
import creational.abstractFactory.TeamFactory;

public class BicycleFactoryTeam implements TeamFactory {
    @Override
    public Assembler getAssembler() {
        return new BicycleAssembler();
    }

    @Override
    public Engineer getEngineer() {
        return new BicycleEngineer();
    }

    @Override
    public QualityTester getQualityTester() {
        return new BicycleQualityTester();
    }
}
