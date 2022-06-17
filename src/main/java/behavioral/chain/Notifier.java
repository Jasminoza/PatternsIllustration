package behavioral.chain;

public abstract class Notifier {
    private int orderPriority;
    private Notifier nextNotifier;

    public Notifier(int orderPriority) {
        this.orderPriority = orderPriority;
    }
    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }
    public void sendMessages(String message, int orderPriority) {
        if (orderPriority >= this.orderPriority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.sendMessages(message, orderPriority);
        }
    }

    public abstract void write(String message);
}
