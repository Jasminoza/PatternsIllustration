package behavioral.chain;

public class ManagerNotifier extends Notifier{
    private Notifier nextNotifier;

    public ManagerNotifier(OrderPriority orderPriority) {
        super(orderPriority);
    }

    @Override
    public void sendMessages(OrderPriority orderPriority) {
        System.out.println(message());
        if (orderPriority != OrderPriority.LOW && orderPriority != OrderPriority.NORMAL) {
            nextNotifier = new BossNotifier(orderPriority);
            nextNotifier.sendMessages(orderPriority);
        }
    }

    protected String message() {
        return "Dear manager, your worker has a new regular order.";
    }
}
