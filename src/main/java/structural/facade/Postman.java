package structural.facade;

public class Postman {
    public void doJob(PackageList packageList) {
        if (packageList.isPackageListContainsOrders()) {
            System.out.println("The postman delivering orders to customers.");
        } else {
            System.out.println("The postman is napping.");
        }
    }
}
