package behavioral.chain;

public class OrderTracker {
    public static void main(String[] args) {
        Notifier workerNotifier = new WorkerNotifier(OrderPriority.LOW);
        Notifier managerNotifier = new ManagerNotifier(OrderPriority.NORMAL);
        Notifier bossNotifier = new BossNotifier(OrderPriority.HIGH);

        workerNotifier.sendMessages(OrderPriority.LOW);
        System.out.println();
        workerNotifier.sendMessages(OrderPriority.NORMAL);
        System.out.println();
        workerNotifier.sendMessages(OrderPriority.HIGH);
    }
}