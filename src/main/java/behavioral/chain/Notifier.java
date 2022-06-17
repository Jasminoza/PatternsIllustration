package behavioral.chain;

public abstract class Notifier {
    private OrderPriority orderPriority;
    private Notifier nextNotifier;

    public Notifier(OrderPriority orderPriority) {
        this.orderPriority = orderPriority;
    }
    public abstract void setNextNotifier(Notifier nextNotifier);
    public abstract void sendMessages(String message, OrderPriority orderPriority);

}
