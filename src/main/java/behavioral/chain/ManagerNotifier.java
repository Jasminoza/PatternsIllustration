package behavioral.chain;

public class ManagerNotifier extends Notifier {

    public ManagerNotifier(int orderPriority) {
        super(orderPriority);
    }

    @Override
    public void write(String message) {
        System.out.println("Message to manager: " + message);
    }
}
