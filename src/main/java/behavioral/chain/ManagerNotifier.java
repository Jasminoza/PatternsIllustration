package behavioral.chain;

public class ManagerNotifier extends Notifier {
    private Notifier nextNotifier;

    public ManagerNotifier(OrderPriority orderPriority) {
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
            if (orderPriority != OrderPriority.NORMAL && orderPriority != OrderPriority.HIGH) {
                nextNotifier.sendMessages(message, orderPriority);
            }
        }
    }
}
