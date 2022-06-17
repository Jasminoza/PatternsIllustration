package behavioral.chain;

public class BossNotifier extends Notifier{

    public BossNotifier(int orderPriority) {
        super(orderPriority);
    }

    @Override
    public void write(String message) {
        System.out.println("Message to boss: " + message);
    }
}
