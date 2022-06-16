package behavioral.chain;

public class WorkerNotifier extends Notifier{
    private Notifier nextNotifier;
    public WorkerNotifier(OrderPriority orderPriority) {
        super(orderPriority);
    }
    @Override
    public void sendMessages(OrderPriority orderPriority) {
        System.out.println(message());
        if (orderPriority != OrderPriority.LOW) {
            nextNotifier = new ManagerNotifier(orderPriority);
            nextNotifier.sendMessages(orderPriority);
        }
    }

    protected String message() {
        return "Dear worker, you have a new order.";
    }
}
