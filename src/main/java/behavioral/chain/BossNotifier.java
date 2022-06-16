package behavioral.chain;

public class BossNotifier extends Notifier{

    public BossNotifier(OrderPriority orderPriority) {
        super(orderPriority);
    }

    @Override
    public void sendMessages(OrderPriority orderPriority) {
        System.out.println(message());
    }

    protected String message(){
        return "Dear boss, your manager has a new high priority order.";
    }
}
