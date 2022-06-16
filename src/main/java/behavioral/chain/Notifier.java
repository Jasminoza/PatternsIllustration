package behavioral.chain;

public abstract class Notifier {
    private OrderPriority orderPriority;

    public Notifier(OrderPriority orderPriority) {
        this.orderPriority = orderPriority;
    }

    public abstract void sendMessages(OrderPriority orderPriority);

    protected abstract String message();
}
