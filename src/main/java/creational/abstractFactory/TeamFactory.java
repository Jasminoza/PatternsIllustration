package creational.abstractFactory;

public interface TeamFactory {
    Assembler getAssembler();
    Engineer getEngineer();
    QualityTester getQualityTester();
}
