package creational.abstractFactory.bicycle;

import creational.abstractFactory.Assembler;

public class BicycleAssembler implements Assembler {

    @Override
    public void buildDevice() {
        System.out.println("Building bicycle...");
    }
}
