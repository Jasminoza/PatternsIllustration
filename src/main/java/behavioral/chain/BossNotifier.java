package behavioral.chain;

public class BossNotifier extends Notifier{
    private Notifier nextNotifier;
    public BossNotifier(OrderPriority orderPriority) {
        super(orderPriority);
    }

    @Override
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void sendMessages(String message, OrderPriority orderPriority) {
        System.out.println(message);
    }

}
