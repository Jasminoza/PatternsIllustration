package behavioral.chain;

public class OrderTracker {
    public static void main(String[] args) {
        Notifier workerNotifier = new WorkerNotifier(OrderPriority.NORMAL);
        Notifier managerNotifier = new ManagerNotifier(OrderPriority.HIGH);
        Notifier bossNotifier = new BossNotifier(OrderPriority.TOP);

        workerNotifier.setNextNotifier(managerNotifier);
        managerNotifier.setNextNotifier(bossNotifier);

        System.out.println("======================================================================");
        workerNotifier.sendMessages("New order has been received.", OrderPriority.NORMAL);
        System.out.println();
        workerNotifier.sendMessages("New order with high priority has been received.", OrderPriority.HIGH);
        System.out.println();
        workerNotifier.sendMessages("NEW TOP PRIORITY ORDER HAS BEEN RECEIVED.", OrderPriority.TOP);
        System.out.println("======================================================================");

        managerNotifier.sendMessages("New order has been received.", OrderPriority.NORMAL);
        managerNotifier.sendMessages("New order with high priority has been received.", OrderPriority.HIGH);
        System.out.println();
        managerNotifier.sendMessages("NEW TOP PRIORITY ORDER HAS BEEN RECEIVED.", OrderPriority.TOP);
        System.out.println("======================================================================");

        bossNotifier.sendMessages("New order has been received.", OrderPriority.NORMAL);
        bossNotifier.sendMessages("New order with high priority has been received.", OrderPriority.HIGH);
        bossNotifier.sendMessages("NEW TOP PRIORITY ORDER HAS BEEN RECEIVED.", OrderPriority.TOP);
        System.out.println("======================================================================");
    }
}
