package creational.abstractFactory.scooter;

import creational.abstractFactory.Assembler;

public class ScooterAssembler implements Assembler {
    @Override
    public void buildDevice() {
        System.out.println("Building scooter...");
    }
}
