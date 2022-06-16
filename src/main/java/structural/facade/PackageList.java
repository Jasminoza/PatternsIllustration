package structural.facade;

public class PackageList {
    private boolean packageListContainsOrders;

    public boolean isPackageListContainsOrders() {
        return packageListContainsOrders;
    }

    public void takingOrders() {
        System.out.println("The company accepts new orders.");
        packageListContainsOrders = true;
    }

    public void completeOrders() {
        System.out.println("The company has fulfilled the orders.");
        packageListContainsOrders = false;
    }
}
