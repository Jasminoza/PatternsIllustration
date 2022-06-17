package behavioral.chain;

public class WorkerNotifier extends Notifier {
    private Notifier nextNotifier;

    public WorkerNotifier(OrderPriority orderPriority) {
        super(orderPriority);
    }

    @Override
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void sendMessages(String message, OrderPriority orderPriority) {
        System.out.println(message);
        if (nextNotifier != null) {
            if (orderPriority != OrderPriority.NORMAL) {
                nextNotifier.sendMessages(message, orderPriority);
            }
        }
    }
}
